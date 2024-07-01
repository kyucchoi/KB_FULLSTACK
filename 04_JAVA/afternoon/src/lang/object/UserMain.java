package lang.object;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("최규찬", "kyucchoi");
        User user2 = new User("최규찬", "kyucchoi");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
