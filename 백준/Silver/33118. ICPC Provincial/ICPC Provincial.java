import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3 * n];
        for (int i = 0; i < 3 * n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int[][] arrs = new int[n][3];
        int idx = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < n; j++)
            {
                arrs[j][i] = arr[idx++];
            }
        }

        int min = 4001;
        for (int i = 0;  i < n; i++)
        {
            min = Math.min(min, arrs[i][1]);
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();

    }

}
