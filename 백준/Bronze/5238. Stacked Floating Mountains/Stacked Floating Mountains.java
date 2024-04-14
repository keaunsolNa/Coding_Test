import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            int[] arr = new int[k];
            for (int i = 0; i < k; i++) arr[i] = Integer.parseInt(st.nextToken());

            boolean chk = true;
            for (int i = 2; i < k - 2; i++) {

                if (arr[i] != arr[i - 2] + arr[i - 1]) {
                    chk = false;
                    break;
                }
            }

            System.out.println(chk ? "YES" : "NO");
        }

    }

}
