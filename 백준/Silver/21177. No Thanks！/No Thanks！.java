import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int prev = arr[0];
        int sum = arr[0];
        for (int i = 1; i < n; i++) {

            if (arr[i] - 1 != prev) sum += arr[i];

            prev = arr[i];

        }

        System.out.println(sum);

    }




}
