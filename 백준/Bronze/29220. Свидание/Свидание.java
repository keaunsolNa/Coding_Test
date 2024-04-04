import java.io.*;
import java.util.*;

public class Main {


    private static long[] arr, minTree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        long sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];

        }

        Arrays.sort(arr);

        System.out.println(sum - arr[0] < k ? "NO" : "YES");




    }
}
