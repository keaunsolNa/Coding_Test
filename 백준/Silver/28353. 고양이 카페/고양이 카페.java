import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] cat = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) cat[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(cat);

        int cnt = 0;
        int min = 0;
        int max = n - 1;

        while(min < max) {

            int mid = cat[min] + cat[max];

            if (mid > k) max--;

            else if (mid < k) {

                cnt++;
                min++;
                max--;

            } else {

                cnt++;
                max--;
                min++;
            }
        }

        System.out.println(cnt);

    }


}