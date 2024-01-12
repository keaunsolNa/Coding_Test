import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        int INF = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) INF = Math.max(INF, X[i] = Integer.parseInt(st.nextToken()));

        int[] P = new int[N + 1], pos = new int[INF + 1];
        for(int i = 0; i < N; i++) pos[X[i]] = i + 1;

        for(int mod : X)
            for(int i = mod * 2; i <= INF; i += mod) {
                if (pos[i] != 0) {
                    P[pos[i]]--;
                    P[pos[mod]]++;
                }
        }
        for(int i = 1; i <= N; i++) sb.append(P[i]).append(" ");
        System.out.print(sb);


    }

}