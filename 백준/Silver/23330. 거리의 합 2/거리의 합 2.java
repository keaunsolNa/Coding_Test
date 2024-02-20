import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        long sum = 0;
        for(int i = 0; i < n; i++) sum += 2 * (n - 1 - 2L * i) * arr[i];

        System.out.println(Math.abs(sum));

    }
}