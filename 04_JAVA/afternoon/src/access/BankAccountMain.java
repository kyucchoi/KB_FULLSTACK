package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(100);
        bankAccount.deposit(100);
        bankAccount.getBalance();
        bankAccount.deposit(-100);
        bankAccount.withdraw(100);
        bankAccount.withdraw(-50);
        bankAccount.withdraw(1000);
        bankAccount.getBalance();
    }
}
