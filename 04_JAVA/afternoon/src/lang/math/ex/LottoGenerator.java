package lang.math.ex;

import java.util.Random;

public class LottoGenerator {
    private int[] lottoNumber;
    private Random random;

    public LottoGenerator() {
        lottoNumber = new int[6]; // 크기가 6인 배열 생성
        random = new Random();
    }

    public void generate() {
        // 배열에 난수를 채우기 위해 반복문 사용
        for (int i = 0; i < 6; i++) {
            int randomNumber;
            boolean isDuplicate;

            do {
                // 1에서 45 사이의 난수 생성
                randomNumber = random.nextInt(45) + 1;
                // 중복 체크
                isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (lottoNumber[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            // 중복이 아니면 배열에 넣기
            lottoNumber[i] = randomNumber;
        }
    }

    public int[] getLottoNumber() {
        return lottoNumber;
    }

    public void printLottoNumber() {
        generate(); // 직접 generate() 메서드 호출

        System.out.print("로또 번호: ");
        for (int i = 0; i < lottoNumber.length; i++) {
            System.out.print(lottoNumber[i] + " ");
        }
        System.out.println(); // 줄 바꿈
    }
}
