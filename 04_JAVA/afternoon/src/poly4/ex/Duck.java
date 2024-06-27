package poly4.ex;

public class Duck implements Animal, Fly{
    @Override
    public void sound() {
        System.out.println("오리가 꽥꽥!");
    }

    @Override
    public void eat() {
        System.out.println("오리가 도토리를 냠냠!");
    }

    @Override
    public void fly() {
        System.out.println("오리가 푸드득!");
    }
}
