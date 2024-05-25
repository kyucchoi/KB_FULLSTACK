const animals = ['cat', 'dog'];

function showAnimals() {
  animals.map((el) => {
    console.log(el);
  });
}

module.exports = {
  animals,
  showAnimals,
};
