import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            int start = 0, end = n - 1;
            int min = Integer.MAX_VALUE;
            int ans = 0;

            while(start < end) {

                int sum = arr[start] + arr[end];
                int gap = Math.abs(sum - k);

                if(min >= gap) {

                    if(min > gap) ans = 0;
                    min = gap;
                    ans++;
                }

                if(sum >= k) end--;
                else start++;
            }
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}