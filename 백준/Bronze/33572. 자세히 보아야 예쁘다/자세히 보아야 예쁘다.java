import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        boolean flag = false;

        for (int i = 0; i < n; i++)
        {
            arr[i] = Long.parseLong(st.nextToken()) - 1;
        }

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {

            if (arr[i] < m) m -= arr[i] ;
            else flag = true;
        }

        bw.write(flag ? "DIMI" : "OUT");
        bw.flush();
        br.close();
        bw.close();
    }

}