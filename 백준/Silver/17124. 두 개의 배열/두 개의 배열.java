import java.io.*;
import java.util.*;

public class Main {

    private static int[] brr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            brr = new int[m];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < m; i++) brr[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(brr);

            long ans = 0;
            int startIdx = 0;
            int endIdx = 0;

            for(int a = 0; a < n; a++) {

                endIdx = Arrays.binarySearch(brr, arr[a]);

                if(endIdx < 0) endIdx = (endIdx + 1) * -1;

                if(endIdx >= m) endIdx--;

                if(endIdx > 0) startIdx = endIdx - 1;

                ans += getValue(arr[a], startIdx, endIdx);
            }
            System.out.println(ans);
        }
    }

    private static int getValue(int target, int left, int right) {

        int difLeft = Math.abs(target - brr[left]);
        int difRight = Math.abs(target - brr[right]);

        if(difLeft > difRight) return  brr[right];
        else return brr[left];

    }

}