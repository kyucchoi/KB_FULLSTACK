const fs = require('fs');

fs.readFile('./chapter02/readme.txt', 'utf-8', function (err, data) {
  if (err) {
    return console.log(err);
  }
  console.log('1번', data);
  fs.readFile('./chapter02/readme.txt', 'utf-8', function (err, data) {
    if (err) {
      return console.log(err);
    }
    console.log('2번', data);
    fs.readFile('./chapter02/readme.txt', 'utf-8', function (err, data) {
      if (err) {
        return console.log(err);
      }
      console.log('3번', data);
      fs.readFile('./chapter02/readme.txt', 'utf-8', function (err, data) {
        if (err) {
          return console.log(err);
        }
        console.log('4번', data);
      });
    });
  });
});
