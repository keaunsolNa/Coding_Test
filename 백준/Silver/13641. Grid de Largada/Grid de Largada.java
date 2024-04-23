import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String input;

        while ((input = br.readLine()) != null) {

            int n = Integer.parseInt(input);
            int[] arr = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) arr[Integer.parseInt(st.nextToken())] = i;

            int[] brr = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) brr[i] = arr[Integer.parseInt(st.nextToken())];

            int cnt = 0;
            for (int i = 1; i < n; i++) {

                for (int j = n; j > i; j--) {

                    if (brr[j - 1] > brr[j]) {
                        int temp = brr[j - 1];
                        brr[j - 1] = brr[j];
                        brr[j] = temp;

                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }


    }
}
