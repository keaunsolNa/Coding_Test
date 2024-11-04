import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] seq = br.readLine().toCharArray();

        sb.append(seq[0]);

        for (int i = 1; i < n; i++)
        {
            int prev = seq[i - 1] - '0';
            int now = seq[i] - '0';
            sb.append(prev + now == 2 ? '0' : prev + now == 1 ? '1' : '0');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


}
