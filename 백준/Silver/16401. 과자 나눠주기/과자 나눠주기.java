import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long result = 0;
        int[] l = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) l[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(l);

        long start = 1;
        long end = l[n - 1];

        while(start <= end) {

            int cnt = 0;
            long mid = (start + end) / 2;

            for(int i = 0; i < n; i++) cnt += l[i] / mid;

            if(cnt >= m) {

                if(result < mid) result = mid;
                start = mid + 1;
            } else end = mid - 1;
        }

        System.out.println(result);

    }

}