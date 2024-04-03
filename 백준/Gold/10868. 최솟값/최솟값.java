import java.io.*;
import java.util.*;

public class Main {


    private static long[] arr, minTree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new long[n + 1];
        minTree = new long[n * 4];

        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(br.readLine());

        minInit(1, n, 1);

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(findMin(1, n, 1, a, b)).append("\n");
        }
        System.out.print(sb);
    }

    public static long minInit(int start, int end, int node) {

        if (start == end) return minTree[node] = arr[start];

        int mid = (start + end) / 2;
        return minTree[node] = Math.min(minInit(start, mid, node * 2), minInit(mid + 1, end, node * 2 + 1));
    }

    private static long findMin(int start, int end, int node, int left, int right) {

        if(right < start || end < left) return Long.MAX_VALUE;
        if(left <= start && end <= right) return minTree[node];

        int mid = (start + end) / 2;

        return Math.min(findMin(start, mid, node * 2, left, right),
                findMin(mid + 1, end, node * 2 + 1, left, right));

    }

}
