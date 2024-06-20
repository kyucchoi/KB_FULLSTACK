package access.refactor;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account1 = new AccountRefactor("국민은행", "골드", "최규찬", 10000);

        // public 요소 접근
        System.out.println(account1.bank);

        // default 요소 접근
        System.out.println(account1.grade);

        // private
//        System.out.println(account1.name);
//        System.out.println(account1.balance);
    }
}
