import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++)
        {
            int x = Integer.parseInt(st.nextToken());
            arr[x]++;
            max = Math.max(max, arr[x]);
        }

        bw.write(max <= (n + 1) / 2 ? "YES" : "NO");
        bw.flush();
        bw.close();
    }



}

