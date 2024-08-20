import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int term1 = b - a < 0 ? Integer.MAX_VALUE : b - a;
        int term2 = m - a + b < 0 ? Integer.MAX_VALUE : m - a + b;
        bw.write(Math.min(term1, term2) + "");
        bw.flush();
        bw.close();
    }
}