import java.util.*;
import java.io.*;

public class Main {

    private static int answer = 100;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        dfs(k, str);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }

    public static void dfs(int K, String S) {

        int size = S.length();
        answer = Math.min(answer, size);

        if (K == 0) return;

        for (int i = 0; i < size; ++i)
        {
            for (int j = i + 1; j < size; ++j)
            {
                if (S.charAt(i) != S.charAt(j) || S.charAt(i) == 'X') continue;

                String nextS = S.substring(0, i) + S.substring(j + 1);

                dfs(K - 1, nextS);
            }
        }
    }
}