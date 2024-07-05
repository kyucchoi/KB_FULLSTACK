package study240628.완주하지못선수;

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap(); // HashMap 객체 생성, 초기 용량은 기본값으로 설정됨
        String answer = ""; // 결과를 저장할 변수

        // 참가자 목록 처리
        for (int i = 0; i < participant.length; i++) {
            // 참가자 이름이 이미 HashMap에 존재하는지 확인
            if (hashMap.get(participant[i]) != null) {
                // 이미 존재한다면 해당 이름의 값을 1 증가시킴
                hashMap.put(participant[i], hashMap.get(participant[i]) + 1);
            } else {
                // 존재하지 않는 경우 해당 이름을 키로 하는 값을 1로 설정함
                hashMap.put(participant[i], 1);
            }
        }

        // 완주자 목록 처리
        for (int i = 0; i < completion.length; i++) {
            // 완주자 이름이 HashMap에 존재하는지 확인
            if (hashMap.get(completion[i]) != null) {
                // 존재한다면 해당 이름의 값을 1 감소시킴 (완주한 사람이므로)
                hashMap.put(participant[i], hashMap.get(completion[i]) - 1); // participant[i]를 사용해야 함
            }
        }

        // 결과 확인
        for (String key : hashMap.keySet()) {
            // HashMap을 순회하면서 값이 0이 아닌 경우, 이는 완주하지 못한 참가자임
            if (hashMap.get(key) != 0) {
                answer = key; // answer에 완주하지 못한 참가자의 이름을 설정함
            }
        }

        return answer; // 완주하지 못한 참가자의 이름을 반환함
    }
}

