import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] cow = new int[n];
        for(int i = 0; i < n; i++) cow[i] = Integer.parseInt(br.readLine());

        int ans = 0;
        for(int i = 0; i < n; i++)

            for(int j = i + 1; j < n; j++)

                if(cow[i] + cow[j] <= s) ans++;

        System.out.println(ans);

    }
}
