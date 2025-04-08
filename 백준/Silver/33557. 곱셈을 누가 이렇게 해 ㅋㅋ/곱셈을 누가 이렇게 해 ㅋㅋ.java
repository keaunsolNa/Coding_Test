import java.util.*;
import java.io.*;

public class Main {

    private static int n, cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0)
        {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            String result = String.valueOf(a * b);

            StringBuilder sb = new StringBuilder();

            long tempA = a;
            long tempB = b;

            while (tempA > 0 && tempB > 0)
            {
                long aDigit = tempA % 10;
                long bDigit = tempB % 10;
                sb.insert(0, aDigit * bDigit);
                tempA /= 10;
                tempB /= 10;
            }

            while (tempA > 0)
            {
                sb.insert(0, tempA % 10);
                tempA /= 10;
            }

            while (tempB > 0)
            {
                sb.insert(0, tempB % 10);
                tempB /= 10;
            }

            bw.write(result.contentEquals(sb) ? "1\n" : "0\n");
        }
        bw.flush();
        bw.close();
    }

}