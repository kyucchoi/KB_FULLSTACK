package interfacee.ex;

public class HumanMain {
    public static void main(String[] args) {
        Human[] humans = {new Korean(), new American(), new Spanish()};

        for (Human h : humans) {
            callHuman(h);
        }
    }

    public static void callHuman(Human human) {
        human.speak();
        human.eat();
        human.hello();
    }
}
