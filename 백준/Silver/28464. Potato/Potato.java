import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        int mid = n / 2;
        int total1 = Arrays.stream(arr, 0 , mid).sum();
        int total2 = Arrays.stream(arr, mid, n).sum();

        System.out.println(total1 + " " + total2);

    }

}
