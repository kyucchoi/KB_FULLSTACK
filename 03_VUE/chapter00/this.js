const kyu = {
  name: '최규찬',
  isOld: true,
  sayHello: function () {
    console.log(this.name);
  },
  nestedObj: {
    name: '방시혁',
    isOld: true,
    sayHello: function () {
      console.log(this.name);
    },
  },
};

kyu.sayHello();
kyu.nestedObj.sayHello();
