package assign.ch11.sec02.exam01;

public class ExceptionHandlingExample {
    public static void printLength(String data) {
        int result = data.length(); // 12번째 줄에서 null을 전달하여, null.length가 실행되어 NullPointException이 발생
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
//        printLength("ThisIsJava");
//        printLength(null); //null 때문에 실행할 수 없음 -> null을 printLength 전달하여 에러 발생

        System.out.println("[프로그램 종료]");
    }
}
