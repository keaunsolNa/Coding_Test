import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i = 1; i <= t; i++) {

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st= new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) arr[j] = Integer.parseInt(st.nextToken());

            int ans = 0;
            for(int j = 1; j < n - 1; j++) {
                if(arr[j] > arr[j - 1] && arr[j] > arr[j + 1]) ans++;
            }

            sb.append("Case #").append(i).append(": ").append(ans).append("\n");
        }

        System.out.print(sb);



    }

}