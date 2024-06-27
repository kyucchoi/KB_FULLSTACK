package polyfinal;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner scanner = new Scanner(System.in);

        int option;
        int amount;

        System.out.print("결제 옵션을 입력하세요 (1. KB PAY / 2. KAKAO PAY / 3. 네이버 PAY) : ");
        option = scanner.nextInt();

        System.out.print("결제 금액을 입력하세요 : ");
        amount = scanner.nextInt();

        if (option == 1) {
            KBPay kbPay = new KBPay();
            paySystem.setPay(kbPay);
        } else if (option == 2) {
            paySystem.setPay(new KakaoPay());
        } else if (option == 3) {
            paySystem.setPay(new NaverPay());
        }

        paySystem.payment(amount);
    }
}
