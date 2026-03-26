import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();

        int count = 0;
        int max = 0;

        for (char c : arr) {

            if (c == '0') count++;
            else count = 0;

            max = Math.max(max, count);
        }

        bw.write(max >= k ? "0" : "1");
        bw.flush();
        bw.close();
    }
}