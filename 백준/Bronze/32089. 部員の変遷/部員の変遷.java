import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true)
        {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

            int max = 0;
            for (int i = 0; i <= n - 3; i++)
            {
                max = Math.max(max, arr[i] + arr[i + 1] + arr[i + 2]);
            }

            System.out.println(max);
        }

    }
}

