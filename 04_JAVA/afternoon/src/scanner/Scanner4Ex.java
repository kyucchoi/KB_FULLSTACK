package scanner;

import java.util.Scanner;

public class Scanner4Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("시작 정수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("종료 정수를 입력하세요 : ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.print("시작 정수가 종료 정수보다 큽니다!");
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.print("시작 수 부터 종료 수 까지의 합은: " + sum);
        }
    }
}
