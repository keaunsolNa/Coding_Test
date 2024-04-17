import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {

            int temp = Integer.parseInt(st.nextToken());
            max = Math.max(temp, max);
            arr[i] = temp;
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] == max) sb.append((char)(i + 'A'));
        }

        System.out.print(sb);


    }

}
