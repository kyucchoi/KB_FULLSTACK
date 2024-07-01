package lang.object;

import access.refactor2.AccountRefactorOuterMain;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();
        System.out.println();

        System.out.println(child.toString());
        System.out.println(child);
        System.out.println();

        String ref1 = Integer.toHexString(child.hashCode());
        String ref2 = Integer.toHexString(System.identityHashCode(child));

        System.out.println("ref1 = " + ref1);
        System.out.println("ref2 = " + ref2);
        System.out.println();

        Parent[] objects = {new Parent(), new Child()};
        Object[] objects2 = {new Parent(), new Child(), new OtherClass()};

        System.out.println(size(objects));
        System.out.println(size(objects2));
    }

    public static int size(Object[] objects) {
        return objects.length;
    }
}
