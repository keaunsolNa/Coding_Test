import java.io.*;
import java.util.*;

public class Main {


    private static int[] arr, minTree, maxTree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        minTree = new int[n * 4];
        maxTree = new int[n * 4];

        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(br.readLine());

        minInit(1, n, 1);
        maxInit(1, n, 1);

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(findMin(1, n, 1, a, b)).append(" ").append(findMax(1, n, 1, a, b)).append("\n");
        }
        System.out.print(sb);
    }

    public static int minInit(int start, int end, int node) {

        if (start == end) return minTree[node] = arr[start];

        int mid = (start + end) / 2;
        return minTree[node] = Math.min(minInit(start, mid, node * 2), minInit(mid + 1, end, node * 2 + 1));
    }

    public static int maxInit(int start, int end, int node) {

        if (start == end) return maxTree[node] = arr[start];

        int mid = (start + end) / 2;
        return maxTree[node] = Math.max(maxInit(start, mid, node * 2), maxInit(mid + 1, end, node * 2 + 1));
    }

    private static int findMin(int start, int end, int node, int left, int right) {

        if(right < start || end < left) return Integer.MAX_VALUE;
        if(left <= start && end <= right) return minTree[node];

        int mid = (start + end) / 2;

        return Math.min(findMin(start, mid, node * 2, left, right),
                findMin(mid + 1, end, node * 2 + 1, left, right));

    }

    private static int findMax(int start, int end, int node, int left, int right) {

        if(right < start || end < left) return Integer.MIN_VALUE;
        if(left <= start && end <= right) return maxTree[node];

        int mid = (start + end) / 2;
        return Math.max(findMax(start, mid, node * 2, left, right),
                findMax(mid + 1, end, node * 2 + 1, left, right));

    }
}
