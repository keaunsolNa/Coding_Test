import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
            Arrays.sort(arr);

            long sum = 0;
            for (int i = 1; i < n - 1; i++) sum += arr[i];

            sb.append(sum / (n - 2)).append("\n");
        }

        System.out.println(sb);
    }


}