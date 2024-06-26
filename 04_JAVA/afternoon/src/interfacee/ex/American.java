package interfacee.ex;

public class American implements Human {
    @Override
    public void speak() {
        System.out.println("Hello!");
    }

    @Override
    public void eat() {
        System.out.println("햄버거를 먹습니다!");
    }

    @Override
    public void hello() {
        System.out.println("Hello. 지금은 " + year + "년입니다!");
    }
}
