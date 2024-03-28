import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int ans = 0;
            int cnt = s.charAt(0) - '0';

            for (int c = 1; c <= n; c++) {

                if (c > cnt) {
                    ans += c - cnt;
                    cnt += c - cnt;
                }
                cnt += s.charAt(c) - '0';
            }

            sb.append("Case #").append(i).append(": ").append(ans).append("\n");
        }

        System.out.println(sb);
    }


}