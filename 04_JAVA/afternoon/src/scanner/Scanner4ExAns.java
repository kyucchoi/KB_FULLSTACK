package scanner;

import java.util.Scanner;

public class Scanner4ExAns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("종료 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.print("시작 정수가 종료 정수보다 큽니다!");
            return;
        }

        int sum = 0;

        for(int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.print("첫번째 숫자에서 두번째 숫자의 합은 : " + sum);
    }
}
