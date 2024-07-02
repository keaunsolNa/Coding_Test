import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[200001];
        boolean[] v = new boolean[200001];
        for (int i = 1; i <= m; i++) a[i] = Integer.parseInt(br.readLine());

        for (int i = m; i >= 1; i--) {

            if (!v[a[i]]) {

                sb.append(a[i]).append("\n");
                v[a[i]] = true;

            }

        }

        for (int i = 1; i <= n; i++) if (!v[i]) sb.append(i).append("\n");

        System.out.println(sb);
    }


}