import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] one = new String[n];
        String[] two = new String[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) one[i] = st.nextToken();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) two[i] = st.nextToken();

        int q = Integer.parseInt(br.readLine());
        while (q --> 0) {

            int target = Integer.parseInt(br.readLine()) - 1;

            String ans = one[target % n] + two[target % m];
            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }


}
