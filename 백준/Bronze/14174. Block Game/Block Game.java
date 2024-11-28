import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[26];

        while (n --> 0)
        {

            String[] str = new String[2];
            int[][] cnt = new int[2][26];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 2; i++)
            {
                str[i] = st.nextToken();
                for (char c : str[i].toCharArray())
                {
                    cnt[i][c - 'a']++;
                }
            }

            for (int i = 0; i < 26; i++)
            {
                ans[i] += Math.max(cnt[0][i], cnt[1][i]);
            }
        }

        for (int cnt : ans)
        {
            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }


}
