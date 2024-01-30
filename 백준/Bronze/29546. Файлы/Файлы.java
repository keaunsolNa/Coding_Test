import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n + 1];
        for(int i = 1; i <= n; i++) arr[i] = br.readLine();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int j = start; j <= end; j++) sb.append(arr[j]).append("\n");
        }

        System.out.print(sb.deleteCharAt(sb.length() - 1));
    }


}