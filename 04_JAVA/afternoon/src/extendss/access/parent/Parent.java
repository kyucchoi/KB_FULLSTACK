package extendss.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    public void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    protected void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("Parent.publicMethod " + publicValue);
        System.out.println("Parent.protectedValue " + protectedValue);
        System.out.println("Parent.defaultValue " + defaultValue);
        System.out.println("privateValue " + privateValue);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
