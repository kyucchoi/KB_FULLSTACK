const obj1 = { name: '박문수', age: 29 };
const obj2 = { name: obj1.name, age: obj1.age, email: 'mspark@gmail.com' };
const obj3 = { ...obj1, email: 'mspark@gmail.com' };

console.log(obj2);
console.log(obj3);
