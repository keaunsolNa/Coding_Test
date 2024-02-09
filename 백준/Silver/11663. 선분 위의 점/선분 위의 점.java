import java.io.*;
import java.util.*;

public class Main {

    private static int n, m;
    private static long[] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new long[n];
        for(int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());

        Arrays.sort(arr);

        for(int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int result = search(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            System.out.println(result);
        }
    }

    private static int search(int x, int y) {

        int left = 0;
        int right = n - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(arr[mid] > y) right = mid - 1;
            else left = mid + 1;
        }

        int endIdx = right + 1;

        left = 0;
        right = n - 1;

        while(left <= right)  {

            int mid = (left + right) / 2;

            if(arr[mid] < x) left = mid + 1;
            else right = mid - 1;
        }

        int startIdx = left;

        return endIdx - startIdx;
    }


}