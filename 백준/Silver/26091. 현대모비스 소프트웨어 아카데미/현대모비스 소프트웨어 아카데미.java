import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        int cnt = 0;


        int left = 0;
        int right = n - 1;

        while(left < right) {

            if(arr[left] + arr[right] >= m) {

                cnt++;
                left++;
                right--;

            }

            else left++;
        }

        System.out.println(cnt);
    }
}