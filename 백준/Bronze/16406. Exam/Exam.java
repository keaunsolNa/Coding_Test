import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();

        int cnt = 0;
        for (int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) == b.charAt(i)) cnt++;
        }

        bw.write(String.valueOf(a.length() - Math.abs(k - cnt)));
        bw.flush();
        bw.close();
        br.close();

    }

}