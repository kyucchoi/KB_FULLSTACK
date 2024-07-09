package collection.map;

import java.util.HashMap;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        // 길이가 10인 배열을 생성
        int[] arr = new int[10];

        // 2. 배열은 값으로 1 ~ 10 사이의 랜덤한 정수를 가집니다
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(10) + 1;
        }

        // 3. Map을 이용해서 특정 값이 몇번 나왔는지를 기록하는 Map 데이터 생성
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= arr.length; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.put(num, map.get(num) + 1);
        }

        System.out.println("map = " + map);
    }
}
