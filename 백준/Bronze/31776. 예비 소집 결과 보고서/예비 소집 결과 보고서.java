import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int t = 0; t < n; t++) {

            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int thr = Integer.parseInt(st.nextToken());

            if (thr >= 0) {

                if (one == -1 || two == -1) continue;

                if (thr >= two && two >= one) ans++;

            }

            else if (two >= 0) {

                if (one == -1) continue;

                if (two >= one) ans++;
            }

            else if (one >= 0) ans++;

        }

        System.out.println(ans);
    }
}
