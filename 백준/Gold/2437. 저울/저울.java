import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < n; i++) {

            if(arr[i] > sum + 1) break;
            sum += arr[i];
        }

        System.out.println(sum + 1);

    }

}
