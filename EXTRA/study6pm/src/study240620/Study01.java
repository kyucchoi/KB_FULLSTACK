package study240620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Study01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> Q = new LinkedList<>();

        // 1. 1부터 N까지를 Q에 더해봅시다 - add, offer
        for (int i = 1; i <= N; i++) {
            Q.offer(i);
        }

        // 2. 값을 조회하여봅시다 - element, peek, contains, size
        System.out.println(Q.element()); // 코드 시스템 종료
        System.out.println(Q.peek()); // null이 반환된다 - peek 사용이 좋다
        System.out.println(Q.contains(3));
        System.out.println(Q.size());

        // 3. 값을 삭제하여봅시다 - remove, poll, clear
        System.out.println(Q.remove()); // 맨 앞의 값을 삭제 반환
        System.out.println(Q);
        System.out.println(Q.peek()); // 맨 앞의 값을 확인
        System.out.println(Q.poll()); // 맨 앞의 값을 제거하고 가져오고 null 반환
        System.out.println(Q.poll());
        Q.clear(); // 내용을 아예 초기화
        System.out.println(Q.peek());
//        System.out.println(Q.element());

        // 4. 값이 비어있는지 확인하여봅시다
        System.out.println(Q.isEmpty());
        Q.add(1);
        System.out.println(Q.isEmpty());

        br.close();
    }
}
