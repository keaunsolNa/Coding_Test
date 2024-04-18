import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;

        int cnt = 0;
        if (n == 1) System.out.println(1);
        else {

            int i;
            for (i = 1; i < n; i++) {
                if (arr[i - 1] + arr[i] > x) break;
            }

            System.out.println(i);
        }



    }

}
