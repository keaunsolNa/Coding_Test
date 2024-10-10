import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[n];
        int x = 0, res = 0;

        while (true)
        {
            arr[x] = true;
            res = x;
            x = (x * 2 + 1) % n;

            if (x == 0 || arr[x]) break;
        }

        bw.write(String.valueOf(res + 1));
        bw.flush();
        bw.close();
        br.close();

    }


}
