package study240628.소수만들기;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 배열 중 3개의 숫자를 선택하여 합을 계산
                    sum = nums[i] + nums[j] + nums[k];

                    //소수 찾기(소수이면 +1)
                    if (isSosu(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isSosu(int num) {
        //i=1부터가 아닌 이유는 1은 나눌 필요 없는 수이므로
        //나누어 떨어지면 소수가 아니므로 false
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        //나누어 떨어지지 않으면 true
        return true;
    }
}
