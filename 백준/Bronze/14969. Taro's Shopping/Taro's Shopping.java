import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            int max = 0;
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if(arr[i] + arr[j] <= m && arr[i] + arr[j] > max) max = arr[i] + arr[j];

            sb.append(max == 0 ? "NONE" : max).append("\n");
        }

        System.out.println(sb);

    }


}
