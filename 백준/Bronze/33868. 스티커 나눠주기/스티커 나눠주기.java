import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int min = Integer.MAX_VALUE;
        while (n --> 0) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            max = Math.max(max, t);
            min = Math.min(min, b);
        }

        int ans = max * min % 7;

        bw.write(String.valueOf((ans + 1)));
        bw.flush();
        bw.close();
        br.close();
    }
}