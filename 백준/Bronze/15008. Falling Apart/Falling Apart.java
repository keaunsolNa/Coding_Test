import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr, Collections.reverseOrder());

        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < n; i++) {

            if(i % 2 == 0) ans1 += arr[i];
            else ans2 += arr[i];
        }

        System.out.println(ans1 + " " + ans2);
    }
}
