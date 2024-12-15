package level1.ㄱ2016년;

public class Solution {
    public String solution(int a, int b) {
        // 각 월의 일수를 저장하는 배열
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 요일을 저장하는 배열 (1월 1일이 금요일이므로 인덱스 5부터 시작)
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        // 1월 1일부터 목표 날짜까지의 총 일수 계산
        int totalDays = b - 1; // 해당 월의 일수

        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i]; // 이전 월들의 일수를 더함
        }

        // 1월 1일이 금요일이므로 5를 더한 후 7로 나눈 나머지를 구함
        int dayIndex = (totalDays + 5) % 7;

        return dayOfWeek[dayIndex];
    }
}
