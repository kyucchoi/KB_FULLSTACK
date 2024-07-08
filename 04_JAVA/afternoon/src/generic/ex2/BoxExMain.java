package generic.ex2;

public class BoxExMain {
    public static void main(String[] args) {
        StrictGenericBox<String> strictGenericBox1 = new StrictGenericBox<>();
        strictGenericBox1.setValue("hello");
        System.out.println("strictGenericBox1 = " + strictGenericBox1.getValue());

        StrictGenericBox<Integer> strictGenericBox2 = new StrictGenericBox<>();
        strictGenericBox2.setValue(100);
        System.out.println("strictGenericBox2 = " + strictGenericBox2.getValue());

        StrictGenericBox<Double> strictGenericBox3 = new StrictGenericBox<>();
        strictGenericBox3.setValue(3.0);
    }
}
