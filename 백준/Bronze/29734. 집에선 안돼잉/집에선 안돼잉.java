import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        long home = n + (n - 1) / 8 * s;
        long dok = t + m + (m - 1) / 8 * (2L * t + s);

        System.out.println(home > dok ? "Dok\n" + dok  : "Zip\n" + home);


    }


}