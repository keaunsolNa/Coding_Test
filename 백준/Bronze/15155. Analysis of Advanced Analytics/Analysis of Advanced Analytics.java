import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int remain = k;
        int ans = 1;
        for (int i = 0; i < n; i++) {

            int today = Integer.parseInt(st.nextToken());
            if (remain - today >= 0) remain -= today;
            else {
                remain = k;
                remain -= today;
                ans++;
            }
        }

        System.out.println(ans);




        System.out.print(sb);
    }
}