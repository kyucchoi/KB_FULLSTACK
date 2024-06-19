package scanner;

import java.util.Random;
import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ranNum = (int) (Math.random() * 100);

        while (true) {
            System.out.print("랜덤 숫자를 입력하세요 : ");
            int input = scanner.nextInt();

            if (input < ranNum) {
                System.out.println("UP");
            } else if (input > ranNum) {
                System.out.println("DOWN");
            } else {
                System.out.println("정답입니다! 랜덤 숫자는 " + ranNum);
                break;
            }
        }
    }
}
