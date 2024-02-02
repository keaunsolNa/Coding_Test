import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i = 1; i <= t; i++) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int g = 0; g < n; g++) arr[g] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);
            int ans = 0;

            for(int in = 0; in < p; in++) {
                if(in >= n || q - arr[in] < 0) break;
                else { ans++; q-= arr[in]; }
            }

            sb.append("Case ").append(i).append(": ").append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
