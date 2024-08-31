import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arrSum = new int[n + 2];
        arrSum[1] = 1;

        for (int t = 2; t <= n + 1; t++)
        {
            st = new StringTokenizer(br.readLine());
            boolean flag = Integer.parseInt(st.nextToken()) == 1;
            int x = Integer.parseInt(st.nextToken()) ;
            int y = Integer.parseInt(st.nextToken()) ;

            boolean isTrue = false;

            if (flag)
            {
                if (arrSum[y] - arrSum[x] == y - x && arrSum[x] - 1 == arrSum[x - 1])
                {
                    arrSum[t] = arrSum[t - 1] + 1;
                    isTrue = true;
                }
                else arrSum[t] = arrSum[t - 1];
            }

            else
            {
                if (arrSum[y] == arrSum[x] && arrSum[x] == arrSum[x - 1])
                {
                    arrSum[t] = arrSum[t - 1] + 1;
                    isTrue = true;
                }
                else arrSum[t] = arrSum[t - 1];
            }

            bw.write(isTrue ? "Yes" : "No");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
