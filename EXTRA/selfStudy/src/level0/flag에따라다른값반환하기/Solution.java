package level0.flag에따라다른값반환하기;

public class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
