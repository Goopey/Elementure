const fs = require('fs')

const fileNames = [
  'elementure.mcreator',
  'src/main/resources/assets/elementure/lang/en_us.json',
]


const { execSync } = require('child_process')
// stderr is sent to stderr of parent process
// you can set options.stdio if you want it to go elsewhere

function git_getLastVersionOfFile(fileName) {
  try {
    return execSync(`git show HEAD:"${fileName}"`, { cwd: __dirname })
  } catch (error) {
    d('error2342545, returning false')
    return false
  }
}
function git_getStaged(fileName) {
  try {
    return execSync(`git show :"${fileName}"`, { cwd: __dirname })
  } catch (error) {
    d('error80980289, returning false')
    return false
  }
}

function git_discard(fileName) {
  try {
    return execSync(`git checkout -- "${fileName}"`, { cwd: __dirname })
  } catch (error) {
    d('error30498309, returning false')
    return false
  }
}
function git_revertStaged(fileName) {
  try {
    const thePatch = execSync(`git diff -- "${fileName}"`, { cwd: __dirname })
    if (thePatch.length) {
      execSync(`git reset -- "${fileName}"`, { cwd: __dirname })
      return execSync(`git apply --reverse`, { cwd: __dirname, input: thePatch })
    } else {
      // https://stackoverflow.com/questions/10362868/git-reset-and-checkout-by-single-command#10363056
      return execSync(`git checkout HEAD -- "${fileName}"`, { cwd: __dirname })
    }
  } catch (error) {
    d('error546748578, returning false')
    return false
  }
}

for (let i = 0, len = fileNames.length; i < len; i++) {
  const fileName = fileNames[i]

  const last = git_getLastVersionOfFile(fileName)
  if (last === false) {
    d(`"${fileName}" is new!`)
    continue
  }
  let lastObj
  try {
    lastObj = JSON.parse(last)
  } catch {
    d(`"${fileName}" : last is not JSON`)
    continue
  }

  // const current = fs.readFileSync(`${__dirname}/${fileName}`)
  // let currentObj
  // try {
  // currentObj = JSON.parse(current)
  // } catch {
  // d(`"${fileName}" : current is not JSON`)
  // continue
  // }

  const staged = git_getStaged(fileName)
  let stagedObj
  try {
    stagedObj = JSON.parse(staged)
  } catch {
    d(`"${fileName}" : staged is not JSON`)
    continue
  }

  //LITERALLY THE SAME BUFFERS
  if (last.compare(staged) === 0) {
    continue
  }

  if (ObjectCollide(lastObj, stagedObj)) {
    // d(last, staged)
    d('SAAAAMMEE')
    // git_discard(fileName)

    //backup
    fs.copyFileSync(fileName, `__bak__current_${fileName}`)
    fs.writeFileSync(`__bak__staged_${fileName}`, staged)

    git_revertStaged(fileName)
  } else {
    d(JSON.stringify(lastObj, null, 2))
    d(JSON.stringify(stagedObj, null, 2))
  }
  // d(getObjectDiff(lastObj, currentObj))
  //if JSON parsed are the same, THEY ARE THE SAME, don't commit, just revert file
  // if (_.isEqual(lastObj, currentObj)) {
  // try {
  // execSync(`git checkout HEAD -- "${fileName}"`)
  // } catch (error) {
  // d(`git checkout HEAD -- "${fileName}" FAILED!!!!!!!!!`)
  // }
  // } else {
  // d(`"${fileName}" is different!`)
  // }
}


function ObjectCollide(obj1, obj2) {
  //in place, returns true if not same, returns false if same

  // delete same
  const keys = Object.keys(obj1)
  const len = keys.length
  let howManyDeleted = 0
  for (let i = 0; i < len; i++) {
    const key = keys[i]
    const value = obj1[key]

    const type = Array.isArray(value) === true ? 'array' : typeof value
    switch (type) {
      case 'object':
        if (ObjectCollide(value, obj2[key])) {
          delete obj1[key]
          delete obj2[key]
          howManyDeleted++
        }
        continue
      case 'array':
        const newArrays = ArrayCollide(value, obj2[key])
        if (newArrays) {
          obj1[key] = newArrays[0]
          obj2[key] = newArrays[1]
        } else {
          delete obj1[key]
          delete obj2[key]
          howManyDeleted++
        }
        continue
      default:
        if (value === obj2[key]) {
          delete obj1[key]
          delete obj2[key]
          howManyDeleted++
        }
    }
  }


  if (howManyDeleted === len && Object.keys(obj2).length === 0) {
    return true
  }
  // return 'delete the stuff'
  // same. we've done it!
}

function ArrayCollide(arr1, arr2) {
  const stringifyObj = {}

  const newArr1 = []
  const newArr2 = []

  for (let i = 0, len = arr1.length; i < len; i++) {
    const value = arr1[i]
    const stringified = JSON.stringify(value)
    stringifyObj[stringified]
    const arr = stringifyObj[stringified] || (stringifyObj[stringified] = [0])
    arr[0]++
    arr.push(value)
  }
  //in 2 but not in 1
  for (let i = 0, len = arr2.length; i < len; i++) {
    const value = arr2[i]
    const stringified = JSON.stringify(value)
    const arr = stringifyObj[stringified]
    if (arr === undefined) {
      newArr2.push(value)
    } else {
      if (arr[0] === 0) {
        newArr2.push(value)
      } else {
        arr[0]--
      }
    }
  }
  //in 1 but not in 2
  stringifyKeys = Object.keys(stringifyObj)
  for (let i = 0, len = stringifyKeys.length; i < len; i++) {
    const arr = stringifyObj[stringifyKeys[i]]

    for (let i = 1, len = arr[0] + 1; i < len; i++) {
      newArr1.push(arr[i])
    }
  }
  if (newArr1.length || newArr2.length) {
    return [newArr1, newArr2]
  } else {
    return false
  }
  // no more
}

//logging function
function d(...args) {
  const util = require('util')

  d = inner //reassign the function
  inner(...args) //pass all arguments the 1st time
  function inner() { //...variadic
    for (let i = 0, len = arguments.length; i < len; i++) {
      console.log(util.inspect(arguments[i], false, null, true /* enable colors */))
    }
  }

}
