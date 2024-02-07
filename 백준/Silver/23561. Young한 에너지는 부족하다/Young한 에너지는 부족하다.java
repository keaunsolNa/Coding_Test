import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3 * n];

        for(int i = 0; i < 3 * n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        System.out.println(arr[3 * n - 1 - n] - arr[n]);

    }

}