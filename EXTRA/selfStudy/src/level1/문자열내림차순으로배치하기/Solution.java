package level1.문자열내림차순으로배치하기;

import java.util.*;

public class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for (String a : str)
            answer += a;

        return answer;
    }
}
