package extendss;

public class GasCar extends Car {
    @Override
    public void move() {
        System.out.println("가스차가 이동합니다.");
    }

    @Override
    public void openDoor() {
        System.out.println("가스차 문을 엽니다.");
    }

    public void fillUp() {
        System.out.println("가스차가 주유합니다!");
    }
}
