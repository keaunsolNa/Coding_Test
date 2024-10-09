import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t  --> 0)
        {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder(br.readLine());

            while (sb.indexOf("ABB") != -1)
            {
                sb.replace(sb.indexOf("ABB"), sb.indexOf("ABB") + 3, "BA");
            }
            bw.write(sb + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }


}
