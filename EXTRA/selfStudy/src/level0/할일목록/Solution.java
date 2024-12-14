package level0.할일목록;

public class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 미완료 항목 개수 계산
        int count = 0;
        for (boolean isFinished : finished) {
            if (!isFinished) count++;
        }

        // 미완료 항목만 담을 배열 생성
        String[] result = new String[count];
        int index = 0;

        // 미완료 항목 추출
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                result[index++] = todo_list[i];
            }
        }

        return result;
    }
}
