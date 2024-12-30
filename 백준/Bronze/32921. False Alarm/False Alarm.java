import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine(), ":");
            int h = Integer.parseInt(st.nextToken());
            int mm = Integer.parseInt(st.nextToken());
            int min = h * 60 + mm;
            arr[i] = min;
        }

        Arrays.sort(arr);
        int term = 2;
        boolean flag = false;
        for (int i = 0; i < n; i++)
        {

            if (flag) break;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] - arr[i] > 10 || flag) break;
                for (int q = j + 1; q < n; q++)
                {
                    if (arr[q] - arr[i] > 10) break;
                    flag = true;
                    term = 0;
                }

                if (!flag)
                {
                    term = 1;
                }
            }
        }

        bw.write(String.valueOf(term));
        bw.flush();
        bw.close();
        br.close();

    }

}
