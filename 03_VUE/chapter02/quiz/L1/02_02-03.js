const p1 = { name: 'john', age: 20 };
p1.age = 22;
console.log(p1); //{ name: 'john', age: 22 };로 바뀜

p1 = { name: 'lee', age: 25 }; //Error (새로운 주소값 사용하기 때문에)

//결과 안나옴
