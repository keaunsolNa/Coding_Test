import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int mid = n / 2;
        int[] arr2 = new int[n / 2];

        for (int i = 0; i < mid; i++) {

            arr2[i] = arr[i] + arr[n - i - 1];
        }

        Arrays.sort(arr2);

        System.out.println(arr2[0]);
    }



}
