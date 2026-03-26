import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            boolean flag = false;
            int target = 0;
            for (int j = 0; j < 3; j++)
            {
                target = Integer.parseInt(st.nextToken()) - 1;
                if (arr[target] > 0)
                {
                    arr[target]--;
                    flag = true;
                    break;
                }
            }

            if (flag) bw.write(String.valueOf(target + 1));
            else bw.write("-1");

            bw.write(" ");
        }

        bw.flush();
        bw.close();
    }
}