import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int a = Integer.parseInt(br.readLine());

        long[] seq = new long[n + 1];

        for (int i = 1; i <= n; i++)
        {

            if (i == 1)
            {
                seq[i] = a;
            }

            else if (i % 2 == 0)
            {
                seq[i] = (p * seq[i / 2]) + q;
            }
            else
            {
                seq[i] = (r * seq[i / 2]) + s;
            }
        }

        long sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += seq[i];
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }

}
