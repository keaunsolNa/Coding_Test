import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        int i = 0;

        while (i < n) {
            int min = a[i];
            int max = a[i];
            int r = i;

            while (r < n) {
                min = Math.min(min, a[r]);
                max = Math.max(max, a[r]);

                int height = r - i + 1;
                int width = max - min + 1;

                if ((long) height * width > k) {
                    break;
                }

                r++;
            }

            ans++;
            i = r;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}