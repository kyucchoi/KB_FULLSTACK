package lang.wrapper;

public class CompareMain {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        Integer integer2 = Integer.valueOf(2);

        Long long1 = Long.valueOf(100);
        Double double1 = Double.valueOf(12.12);

        System.out.println(integer1.intValue());
        System.out.println(integer2.intValue());
        System.out.println(long1.longValue());
        System.out.println(double1.doubleValue());
    }
}
