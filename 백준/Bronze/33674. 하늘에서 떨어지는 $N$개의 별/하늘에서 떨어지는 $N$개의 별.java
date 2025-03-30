import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int maxStar = 0;
        int ans = 0;
        int starCnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            maxStar = Math.max(maxStar, temp);
        }

        while (D --> 0)
        {
            starCnt += maxStar;
            if (starCnt > K)
            {
                starCnt = maxStar;
                ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

}