package study240620;

import java.io.*;
import java.util.*;

public class Study02 {
    public static void main(String[] args) throws IOException {
        /*
         * 케이크문제
         * 문제 : 어느날, 현수의 옆자리에 앉은 준일이형이 롤케이크를 가져왔다.
         * 롤케이크는 N등분 되어있는 케이크였으며, 준일이형 몰래 박스의 뒷면을보니
         * 케이크는 K번째 조각마다 잼이 많이 묻어있다고 한다.
         * 준일이형이 선뜻 케이크를 나눠먹자고 하자, 욕심이 생긴 현수는 양보하는 척
         * 형이 K-1 개를 먹을때마다, 본인이 한개씩 집어먹겠다고 얘기했다.
         * 케이크가 N등분 되어있고 K번째마다 조각에 잼이 많이 뭍어 있고,
         * 케이크는 둘이서 전부 먹는다고 가정했을때,
         * 현수가 먹을 케이크의 조각은 몇번째 몇번째일지 출력하세요.
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int now = 0;

        Queue<Integer> Q = new LinkedList<>();

        for (int i = N; i > 0; i--) {
            Q.offer(i);
        }
        System.out.println(Q.size());

//        for (int i = N; i > 0; i--) {
//            Q.poll();
//            now += 1;
//            if (now % K == 0) {
//                System.out.println(now + "번째 냠냠");
//            }
//        }

        while (!Q.isEmpty()) {
            Q.poll();
            now += 1;
            if (now % K == 0) {
                System.out.println(now + "번째 우적우적");
            }
        }

        System.out.println("배부르다!");
        br.close();
    }
}