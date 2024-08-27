import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        while (m --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (k == 1)
            {
                for (int i = l - 1; i < r; i++)
                {
                    arr[i] *= arr[i];
                    arr[i] %= 2010;
                }
            }
            else
            {
                int sum = 0;
                for (int i = l - 1; i < r; i++)
                {
                    sum += arr[i];
                }
                bw.write(sum + "\n");
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
