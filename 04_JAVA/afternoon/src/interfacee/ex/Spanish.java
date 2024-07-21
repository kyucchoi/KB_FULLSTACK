package interfacee.ex;

public class Spanish implements Human {
    @Override
    public void speak() {
        System.out.println("Hola!");
    }

    @Override
    public void eat() {
        System.out.println("El paella?");
    }

    @Override
    public void hello() {
        System.out.println("Hola. 지금은 " + year + "년입니다!");
    }
}
