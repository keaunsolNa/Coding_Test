import java.io.*;
import java.util.*;

public class Main {

    private static final long MAX = 100000000;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());

        while (c --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            long n = Integer.parseInt(st.nextToken());
            long t = Integer.parseInt(st.nextToken());
            long l = Integer.parseInt(st.nextToken());
            long sum = 0;

            switch (str)
            {
                case "O(N)" :

                    sum = n * t;
                    bw.write(sum <= (l * MAX) ? "May Pass.\n" : "TLE!\n");
                    break;

                case "O(N^2)" :

                    if (n >= 31623) bw.write("TLE!\n");
                    else
                    {
                        sum = (n * n * t);
                        bw.write(sum <= (l * MAX) ? "May Pass.\n" : "TLE!\n");
                    }
                    break;

                case "O(N^3)" :

                    if (n >= 1001) bw.write("TLE!\n");
                    else
                    {
                        sum = (n * n * n * t);
                        bw.write(sum <= (l * MAX) ? "May Pass.\n" : "TLE!\n");
                    }
                    break;

                case "O(2^N)" :

                    if (n >= 30) bw.write("TLE!\n");
                    else
                    {
                        sum = (long) (Math.pow(2, n) * t);
                        bw.write(sum <= (l * MAX) ? "May Pass.\n" : "TLE!\n");
                    }
                    break;

                case "O(N!)" :

                    if (n >= 13) bw.write("TLE!\n");
                    else
                    {
                        sum = t;
                        for (long i = 1; i <= n; i++) sum *= i;
                        bw.write(sum <= (l * MAX) ? "May Pass.\n" : "TLE!\n");
                    }
            }
        }

        bw.flush();
        bw.close();
    }
}