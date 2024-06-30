package polyfinal.ex;

import java.util.Scanner;

public class Driver2 {
    private Car car;
    Scanner scanner = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }

    public void selectCar() {
        System.out.print("운전하고 싶은 차를 선택하세요. (1. K5 / 2. 그랜져 / 3. G70) : ");
        int choice = scanner.nextInt();
        this.choiceCar(choice);
    }

    public void choiceCar(int choice) {
        if (choice == 1) {
            this.setCar(new K5Car());
        } else if (choice == 2) {
            this.setCar(new Grand());
        } else if (choice == 3) {
            this.setCar(new G70());
        }
    }

    public void driveCar() {
        car.drive();
    }
}
