package lang.immutable;

public class ImmutableName {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("최규찬");
        ImmutableUser user2 = user1;

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
        System.out.println();

        user2 = user2.setName("이효석");
        System.out.println("user2 의 이름을 변경");
        System.out.println();

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}
