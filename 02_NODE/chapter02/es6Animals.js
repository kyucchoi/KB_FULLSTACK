export const animals = ['cat', 'dog'];

export function showAnimals() {
    for(let i=0; i < animals.length; i++) {
        console.log(animals[i]);

    }
}

animals.map((el) => console.log)