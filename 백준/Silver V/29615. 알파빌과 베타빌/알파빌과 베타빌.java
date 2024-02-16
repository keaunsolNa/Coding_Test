import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] friend = new int[m];
        for(int i = 0; i < m; i++) friend[i] = Integer.parseInt(st.nextToken());

        int ans = 0;
        for(int i = 0; i < m; i++)

            for(int j = 0; j < m; j++)

                if(arr[j] == friend[i]) ans++;


        System.out.println(m - ans);

    }
}