https://stackoverflow.com/questions/936249/how-to-stop-tracking-and-ignore-changes-to-a-file-in-git/40272289#40272289

> 2. This is for optimization, like a folder with a large number of files, e.g. SDKs that probably won't ever change. It tells git to stop checking that huge folder every time for changes, locally, since it won't have any. **The assume-unchanged index will be reset and file(s) overwritten if there are upstream changes to the file/folder (when you pull).** I want Paul's changes


everyone, run this<br>
`git update-index --assume-unchanged -- ".classpath"`

you need to have [node.js](https://nodejs.org/en/download/) for `/revert equal json.js`
