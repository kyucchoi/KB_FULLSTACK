package level1.완주하지못한선수;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        // 각 이름의 등장 횟수를 저장할 HashMap
        Map<String, Integer> runners = new HashMap<>();

        // 참가자 명단의 모든 이름을 HashMap에 추가
        for (String name : participant) {
            runners.put(name, runners.getOrDefault(name, 0) + 1);
        }

        // 완주자 명단의 이름을 HashMap에서 제거
        for (String name : completion) {
            int count = runners.get(name);

            if (count == 1) {
                runners.remove(name);
            } else {
                runners.put(name, count - 1);
            }
        }

        // HashMap에 남은 한 명이 완주하지 못한 선수
        return runners.keySet().iterator().next();
    }
}
