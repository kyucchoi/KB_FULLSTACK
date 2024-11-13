package level1.문자열내마음대로정렬하기;

import java.util.*;

public class Solution {
    public String[] solution(String[] strings, int n) {
        // Comparator를 사용하여 정렬 기준 정의
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 인덱스의 문자 비교
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) {
                    // n번째 문자가 같을 경우 전체 문자열을 사전순으로 비교
                    return s1.compareTo(s2);
                } else {
                    // n번째 문자가 다를 경우 해당 문자로 비교
                    return c1 - c2;
                }
            }
        });

        return strings;
    }
}

//// 람다식을 사용한 더 간단한 구현
//class AlternativeSolution {
//    public String[] solution(String[] strings, int n) {
//        Arrays.sort(strings, (s1, s2) ->
//                s1.charAt(n) == s2.charAt(n) ?
//                        s1.compareTo(s2) :
//                        s1.charAt(n) - s2.charAt(n)
//        );
//
//        return strings;
//    }
//}