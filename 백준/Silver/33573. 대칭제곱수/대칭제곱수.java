import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t  = Integer.parseInt(br.readLine());
        while (t --> 0)
        {
            StringBuilder str = new StringBuilder(br.readLine());
            long n = Long.parseLong(str.toString());
            long reverse = Long.parseLong(str.reverse().toString());

            if (Math.sqrt(n) % 1 == 0 && Math.sqrt(reverse) % 1 == 0) bw.write("YES\n");
            else bw.write("NO\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}