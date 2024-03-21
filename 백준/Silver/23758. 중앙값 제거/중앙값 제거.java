import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int mid = (n + 1) / 2;
        int result = 0;

        for (int i = 0; i < mid; i++) result += solve(arr[i]);

        System.out.println(result + 1);

    }

    private static int solve(int val) {

        int cnt = 0;
        while (val > 1) {
            cnt++;
            val /= 2;
        }

        return cnt;
    }
}
