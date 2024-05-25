let output = '';
for (let i = 0; i < 10; i++) {
  output += '<h1>Header - ' + i + '<h1>';
}
document.body.textContent = output;
// document.body.innerHTML = output;
