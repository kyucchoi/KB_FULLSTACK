// 1
let getTriangle = (base, height) => (base * height) / 2;

console.log('삼각형의 면적:' + getTriangle(5, 2));

// 2
function displayA() {
  console.log('A');
}

function displayB() {
  setTimeout(() => {
    console.log('B');
  }, 2000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB();
displayC();

// 3
function displayA() {
  console.log('A');
}

function displayB(callback) {
  setTimeout(() => {
    console.log('B');
    callback();
  }, 2000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB(displayC);

// 4 코딩 흐름이 잘 이해되지 않습니다.
const order = (coffee, callback) => {
  console.log(`${coffee} 주문 접수`);
  setTimeout(() => {
    callback(coffee);
  }, 3000);
};

const display = (result) => {
  console.log(`${result} 완료!`);
};

order('아메리카노', display);
