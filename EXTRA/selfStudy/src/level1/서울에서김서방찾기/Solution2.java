package level1.서울에서김서방찾기;

public class Solution2 {
    public String solution(String[] seoul) {
        int i = 0;
        for (String name : seoul) {
            if (name.equals("Kim")) {
                break;
            }
            i++;
        }
        return "김서방은 " + i + "에 있다";
    }
}
