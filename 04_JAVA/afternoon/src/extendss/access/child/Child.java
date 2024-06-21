package extendss.access.child;

import extendss.access.parent.Parent;

public class Child extends Parent {
    public void access() {
        System.out.println("publicValue : " + publicValue); // 어디서든 접근 가능
        System.out.println("protectedValue : " + protectedValue); // 패키지는 다르지만, 상속 관계
//        System.out.println("defaultValue : " + defaultValue); // 패키지가 달라서 불가능
//        System.out.println("privateValue : " + privateValue); // 같은 클라스가 아니라서 불가능

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        protectedMethod();

        printParent();
    }

}
