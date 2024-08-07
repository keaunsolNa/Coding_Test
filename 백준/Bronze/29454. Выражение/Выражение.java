import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        int min = Integer.MAX_VALUE, ans = 0;
        for (int i = 1; i <= n; i++) {

            if (arr[i - 1] == sum - arr[i - 1] && min > arr[i - 1])
            {
                min = arr[i - 1];
                ans = i;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }



}

