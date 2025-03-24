import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long min = Long.MAX_VALUE;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            long m = Long.parseLong(st.nextToken());
            boolean flag = Integer.parseInt(st.nextToken()) == 1;

            if (!flag) min = Math.min(m, min);
        }

        if (min == Long.MAX_VALUE) bw.write("-1");
        else bw.write(String.valueOf(min));

        bw.flush();
        br.close();
        bw.close();
    }

}