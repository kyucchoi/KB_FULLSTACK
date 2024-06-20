package access.refactor2;

import access.refactor.AccountRefactor;

public class AccountRefactorOuterMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("신한은행", "실버", "최규찬", 10000);

        // public 요소 접근
        System.out.println(account.bank);

        // default 요소 접근
//        System.out.println(account.grade);
    }
}
