import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t --> 0)
        {

            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            int idx = 1;
            int ans = 1;
            for (int i = 0; ; i++) {

                if (s == l || s == r) break;

                if (i % 2 == 0) s += idx++;
                else s -= idx++;

                ans++;
            }

            System.out.println(ans);
        }

    }
}

