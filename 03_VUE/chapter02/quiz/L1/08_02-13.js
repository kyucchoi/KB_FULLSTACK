let obj = { result: 0 };

obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner();
};
obj.add(3, 4);

console.log(obj);
console.log(result);

//{ result: 0, add: [Function (anonymous)] }
//7
//잘못된 코드
