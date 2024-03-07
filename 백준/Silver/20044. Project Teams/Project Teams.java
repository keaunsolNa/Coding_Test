import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2 * n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int min = arr[0] + arr[2 * n - 1];
        for (int i = 1; i < n; i++) {

            min = Math.min(min, arr[i] + arr[2 * n - 1 - i]);
        }
        System.out.println(min);


    }



}
