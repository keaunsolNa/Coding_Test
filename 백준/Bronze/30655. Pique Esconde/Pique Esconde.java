import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            boolean[] arr = new boolean[n];
            arr[m - 1] = true;
            for (int i = 0; i < n - 2; i++) arr[Integer.parseInt(br.readLine()) - 1] = true;

            for (int i = 0; i < n; i++) {

                if (!arr[i]) System.out.println(i + 1);
            }

        }

    }

}
