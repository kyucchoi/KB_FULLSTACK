const promise = new Promise((resolve, reject) => {
  console.log('나 로또 사도 될까!?');
  setTimeout(() => {
    const rand = parseInt(Math.random() * 10);
    console.log(`나온 숫자는 ${rand}`);
    if (rand >= 5) {
      resolve('아싸! 로또 사자');
    } else {
      reject('아.. 망했어요');
    }
  }, 3000);
})
  .then((resolve) => {
    showResult(resolve);
  })
  .catch((reject) => {
    showResult(reject);
  });

function showResult(promise) {
  console.log(promise);
}

// promise
//   .then(function (resolve) {
//     console.log(resolve);
//   })
//   .catch(function (reject) {
//     console.log(reject);
//   });
