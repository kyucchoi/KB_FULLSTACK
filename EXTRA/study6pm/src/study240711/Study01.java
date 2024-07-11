package study240711;

public class Study01 {
    public static void main(String[] args) {
        int number = 5; // 예시로 5의 팩토리얼을 계산합니다.
        int result = factorial(number);
        System.out.println(" = Factorial result : " + result);
    }

    private static int factorial(int n) {
        if (n == 1) {
            System.out.print(n);
            return 1;
        }
        System.out.print(n + " * ");
        return n * factorial(n - 1);
    }
}
