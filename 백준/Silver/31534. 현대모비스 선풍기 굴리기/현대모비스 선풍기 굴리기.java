import java.io.*;
import java.util.*;

public class Main {

    static double a, b, h, lowH;
    static final double PI = Math.PI;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());
        h = Double.parseDouble(st.nextToken());

        bw.write(solve());
        bw.flush();
        bw.close();
        br.close();

    }

    private static String solve ()
    {

        if (a == b)
        {
            return "-1";
        }
        if (a > b)
        {
            double temp = a;
            a = b;
            b = temp;
        }

        lowH = a * h / (b - a);

        double big = Math.pow(lowH + h, 2) + Math.pow(b, 2);
        double small = a != 0 ? Math.pow(lowH, 2) + Math.pow(a, 2) : 0;

        return String.format("%.7f", (big - small) * PI);
    }


}
