import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] brr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) brr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        Arrays.sort(brr);

        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < m; i++) {   // 작업 시간

            for (int j = idx; j < n; j++) { // 가능 시간

                if (brr[j] >= arr[i]) {
                    cnt++;
                    idx = j + 1;
                    break;
                }
            }
        }

        System.out.println(cnt);


    }




}
