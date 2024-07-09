package collection.set;

import java.util.HashSet;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        // 길이가 10인 배열을 생성
        int[] num = new int[10];

        // 2. 배열은 값으로 1 ~ 10 사이의 랜덤한 정수를 가집니다
        for (int i = 0; i < num.length; i++) {
            Random random = new Random();
            num[i] = random.nextInt(10) + 1;
        }

        // 3. Set 을 이용해서 발생한 배열에 중복 값이 있으면 "중복이다!"
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            boolean isContain = set.add(num[i]);
            if (!isContain) {
                System.out.println(num[i] + " 는 중복이다!");

                // 4. 중복이 없을 경우에는 "중복이 아니다!"
            } else {
                System.out.println(num[i] + " 는 중복이 아니다!");
            }
        }
    }
}
