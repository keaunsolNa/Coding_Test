import java.util.*;
import java.io.*;

public class Main {

    private static String want;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
    
        while (t --> 0) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            Integer[] grisha = new Integer[n];
            Integer[] dina = new Integer[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) grisha[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(grisha);

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) dina[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(dina, Collections.reverseOrder());

            int ans = 0;
            for (int i = 0; i < l; i++) ans += grisha[i] - dina[i];

            sb.append(ans > 0 ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);

    }

}
