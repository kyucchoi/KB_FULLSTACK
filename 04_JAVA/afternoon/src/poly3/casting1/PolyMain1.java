package poly3.casting1;

public class PolyMain1 {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();
        System.out.println();

        Parent parent = new Child();

//        Child poly = (Child) parent;
//
//        poly.childMethod();

        ((Child) parent).childMethod();
    }
}
