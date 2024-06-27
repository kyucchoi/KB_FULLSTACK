package poly4;

public class Tetz implements Animal, Human {
    @Override
    public void eat() {
        System.out.println("테츠가 콜라를 마십니다!");
    }
    
    @Override
    public void sleep() {
        System.out.println("테츠는 술 먹으면 잡니다");
    }
    
    @Override
    public void think() {
        System.out.println("테츠는 생각을 합니다");
    }
}
