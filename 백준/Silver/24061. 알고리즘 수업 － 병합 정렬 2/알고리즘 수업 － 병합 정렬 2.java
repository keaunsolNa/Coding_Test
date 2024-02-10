import java.io.*;
import java.util.*;

public class Main {

    private static int n, k;
    private static int[] arr, sorted;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        sorted = arr.clone();
        merge(0, n - 1);

        System.out.println(-1);
    }

    public static void merge(int left, int right) {

        if(left < right) {

            int mid = (left + right) / 2;
            merge(left, mid);
            merge(mid + 1, right);
            merge(left, mid, right);

        }

    }

    public static void merge(int left, int mid, int right) {

        int l = left;
        int r = mid + 1;
        int index = 0;

        while (l <= mid && r <= right) {

            if(arr[l] <= arr[r]) sorted[index++] = arr[l++];
            else sorted[index++] = arr[r++];

        }

        while (l <= mid) {
            sorted[index++] = arr[l++];
        }

        while (r <= right) {
            sorted[index++] = arr[r++];
        }

        l = left;
        index = 0;

        while (l <= right) {

            arr[l++] = sorted[index++];
            k--;

            if(k == 0) {

                for(int i = 0; i < n; i++) sb.append(arr[i]).append(" ");

                System.out.println(sb);
                System.exit(0);
            }
        }

    }
}