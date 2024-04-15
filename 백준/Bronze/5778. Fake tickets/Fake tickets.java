import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            List<Integer> list = new ArrayList<>();
            boolean[] dup = new boolean[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {

                int temp = Integer.parseInt(st.nextToken());
                if (list.contains(temp)) dup[temp] = true;
                else list.add(temp);
            }

            int ans = 0;
            for (int i = 1; i <= n; i++) if (dup[i]) ans++;
            System.out.println(ans);

        }



    }

}