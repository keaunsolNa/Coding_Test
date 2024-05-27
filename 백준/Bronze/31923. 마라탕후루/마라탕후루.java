import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) b[i] = Integer.parseInt(st.nextToken());

        int[] ans = new int[n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {

            int cnt = 0;
            if (a[i] == b[i]) continue;
            else {

                while (a[i] != b[i]) {

                    a[i] += p;
                    b[i] += q;
                    cnt++;

                    if (cnt > 10000) break;
                }
            }

            if (cnt > 10000) {
                flag = false;
                break;
            }

            ans[i] = cnt;
        }

        if (!flag) {
            System.out.println("NO");
        }

        else {

            System.out.println("YES");
            for (int i = 0; i < n; i++) System.out.print(ans[i] + " ");
        }
    }
}
