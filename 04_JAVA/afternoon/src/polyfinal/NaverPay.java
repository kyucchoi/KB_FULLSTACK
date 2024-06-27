package polyfinal;

public class NaverPay implements Pay {
    @Override
    public void pay(int amount) {
        System.out.println("네이버 페이와 연결합니다!");
        System.out.println(amount + " 원 결제 시도합니다!");
        System.out.println("결제 성공!");
    }
}
