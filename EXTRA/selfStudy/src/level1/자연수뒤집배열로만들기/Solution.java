package level1.자연수뒤집배열로만들기;

public class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = Integer.parseInt(str.substring(answer.length - i - 1, answer.length - i));
        }

        return answer;
    }
}
