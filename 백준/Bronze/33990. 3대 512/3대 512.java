import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            if (sum >= 512) min = Math.min(min, sum);
        }

        bw.write(String.valueOf(min == Integer.MAX_VALUE ? -1 : min));
        bw.flush();
        bw.close();
        br.close();
    }


}