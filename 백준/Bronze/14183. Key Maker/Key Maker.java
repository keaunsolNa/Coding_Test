import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (m == 0 && n == 0) break;
            
            int[] customer = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) customer[i] = Integer.parseInt(st.nextToken());

            int ans = 0;
            for (int i = 0; i < n; i++) {

                boolean flag = true;
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {

                    if (Integer.parseInt(st.nextToken()) > customer[j]) flag = false;

                }

                if (flag) ans++;

            }

            System.out.println(ans);
        }


    }

}