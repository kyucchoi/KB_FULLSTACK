package study240711;

public class Study02 {
    public static void main(String[] args) {
        int number = 10; // 예시로 10번째 피보나치 수를 계산합니다.
        int result = fibonacci(number);
        System.out.println("Fibonacci number at position " + number + " is " + result);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
