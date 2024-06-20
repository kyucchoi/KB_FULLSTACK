package access;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(10000);

        account.deposit(1000); //이자
        account.deposit(2000); //학식

        System.out.println("남은 금액은 : " + account.balance);
    }
}
