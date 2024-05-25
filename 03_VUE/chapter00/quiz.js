// const obj = {
//   name: '최규찬',
//   isOld: true,
// };

// obj.key;

// getKeyValue(obj, 'name');

// function getKeyValue(obj, key) {
//   console.log(obj[key]);
// }

const obj = {
  name: '최규찬',
  isOld: true,
  condition: 'good',
};

for (let key in obj) {
  console.log(`key 값은 ${key} 이고, value ${obj[key]} 입니다`);
}
