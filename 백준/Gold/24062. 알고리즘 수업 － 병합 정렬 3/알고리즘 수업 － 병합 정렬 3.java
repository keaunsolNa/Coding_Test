import java.io.*;
import java.util.*;

public class Main {

    private static int n, count = 0, now = 0;
    private static int[] arr, target, sorted;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        target = new int[n];
        for(int i = 0; i < n; i++) target[i] = Integer.parseInt(st.nextToken());

        sorted = arr.clone();
        check();
        merge(0, n - 1);
        System.out.println(count);
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

            if(count < 1) {

                while(true) {

                    if(arr[now] == target[now]) {

                        if (now == arr.length - 1) {
                            count = 1;
                            break;
                        }
                        now++;
                    } else break;
                }
            }
        }

    }

    private static void check() {
        for(int i = 0; i < n; i++) {

            if(arr[i] != target[i]) return;
        }
        System.out.println(1);
        System.exit(0);
    }
}