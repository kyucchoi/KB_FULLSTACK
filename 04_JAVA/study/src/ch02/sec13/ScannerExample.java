package ch02.sec13;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 입력: ");
        String strX = sc.nextLine();
        int x = Integer.parseInt(strX);

        System.out.println("y 값 입력: ");
        String strY = sc.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();
    }
}
