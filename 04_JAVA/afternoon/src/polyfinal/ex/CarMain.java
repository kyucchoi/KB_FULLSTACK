package polyfinal.ex;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = {new K5Car(), new Grand(), new G70()};

        for (Car car : cars) {
            carDo(car);
        }
    }

    public static void carDo(Car car) {
        car.openDoor();
        System.out.println();
        car.drive();
        System.out.println();
    }
}