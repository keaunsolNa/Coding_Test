import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int now = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {

            boolean can = Integer.parseInt(st.nextToken()) == 1;

            if (can) now++;
            else now = 0;
            max = Math.max(now, max);
        }

        System.out.println(max);
    }
}