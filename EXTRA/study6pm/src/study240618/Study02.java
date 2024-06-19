package study240618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 010 1234 5678
        // 010 / 1234 / 5678

        String first = st.nextToken();
        String second = st.nextToken();
        String third = st.nextToken();

        System.out.println(first + second + third);
    }
}
