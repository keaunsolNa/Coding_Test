import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = -1;
        int idx = 1;
        sum[0] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
        {

            if (sum[idx - 1] >= m)
            {
                ans = n - idx + 1;
                break;
            }
            sum[idx] = arr[i] + sum[idx++ - 1];
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }

}
