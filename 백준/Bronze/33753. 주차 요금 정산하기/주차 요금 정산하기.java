import java.util.*;
import java.io.*;

public class Main {

    private static int n, cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());

        if (t <= 30) bw.write(String.valueOf(a));
        else
        {
            int overTime = (t - 30) % b == 0 ? (t - 30) / b * c : ((t - 30) / b + 1) * c;
            overTime += a;
            bw.write(String.valueOf(overTime));
        }

        bw.flush();
        bw.close();
    }

}