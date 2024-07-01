package lang.immutable;

public class RefMain {
    public static void main(String[] args) {
        User user1 = new User("최규찬");
        User user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println();

        user2.setName("이효석");
        System.out.println("user2 의 이름을 이효석으로 변경 = " + user2);
        System.out.println();

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
