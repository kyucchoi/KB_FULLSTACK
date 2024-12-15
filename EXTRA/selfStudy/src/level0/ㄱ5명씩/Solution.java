package level0.ㄱ5명씩;

public class Solution {
    public String[] solution(String[] names) {
        // 결과 배열의 크기 계산 (올림 나눗셈)
        int resultSize = (names.length + 4) / 5;
        String[] result = new String[resultSize];

        // 5명씩 건너뛰면서 첫 번째 사람 선택
        for (int i = 0; i < names.length; i += 5) {
            result[i/5] = names[i];
        }

        return result;
    }
}
