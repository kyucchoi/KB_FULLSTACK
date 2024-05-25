const fs = require('fs').promises;

fs.readFile('./chapter02/readme.txt')
  .then(function (data) {
    console.log(data.toString());
    return fs.readFile('./chapter02/readme2.txt');
  })
  .then((data) => {
    console.log(data.toString());
    return fs.readFile('./chapter02/readme3.txt');
  })
  .then((data) => {
    console.log(data.toString());
    return fs.readFile('./chapter02/readme4.txt');
  })
  .then((data) => {
    console.log(data.toString());
  })
  .catch(function (err) {
    console.log(err);
  });
