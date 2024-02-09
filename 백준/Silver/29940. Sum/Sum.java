import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int ans = 0;
        for(int i = 0; i < n; i++) {

            int left = i + 1;
            int right = n - 1;

            while(left <= right) {

                int mid = (left + right) / 2;
                int sum = arr[i] + arr[mid];

                if(sum == s) ans++;

                if(sum < s) left = mid + 1;
                else right = mid - 1;
            }
        }

        System.out.println(ans);
    }

}