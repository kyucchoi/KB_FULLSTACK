package level1.카드뭉치;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;  // cards1의 현재 인덱스
        int idx2 = 0;  // cards2의 현재 인덱스

        // goal 배열의 각 단어를 순서대로 확인
        for (String targetWord : goal) {
            // cards1에서 현재 단어를 찾을 수 있는 경우
            if (idx1 < cards1.length && targetWord.equals(cards1[idx1])) {
                idx1++;
            }
            // cards2에서 현재 단어를 찾을 수 있는 경우
            else if (idx2 < cards2.length && targetWord.equals(cards2[idx2])) {
                idx2++;
            }
            // 어느 카드 뭉치에서도 현재 단어를 찾을 수 없는 경우
            else {
                return "No";
            }
        }

        return "Yes";
    }
}
