package level1.푸드파이트대회;

public class Solution {
    public String solution(int[] food) {
        StringBuilder leftHalf = new StringBuilder();

        // 1번 음식부터 순서대로 처리
        for (int i = 1; i < food.length; i++) {
            // 각 음식을 두 선수가 나눠 먹을 수 있는 개수만큼 추가
            int count = food[i] / 2;
            leftHalf.append(String.valueOf(i).repeat(count));
        }

        // 왼쪽 배치 + 물(0) + 왼쪽 배치 뒤집기
        return leftHalf.toString() + "0" + leftHalf.reverse().toString();
    }
}

// StringBuilder.repeat()를 사용할 수 없는 경우의 대체 구현
//class AlternativeSolution {
//    public String solution(int[] food) {
//        StringBuilder leftHalf = new StringBuilder();
//
//        // 1번 음식부터 순서대로 처리
//        for (int i = 1; i < food.length; i++) {
//            // 각 음식을 두 선수가 나눠 먹을 수 있는 개수만큼 추가
//            int count = food[i] / 2;
//            for (int j = 0; j < count; j++) {
//                leftHalf.append(i);
//            }
//        }
//
//        // 왼쪽 배치 + 물(0) + 왼쪽 배치 뒤집기
//        return leftHalf.toString() + "0" + leftHalf.reverse().toString();
//    }
//}
