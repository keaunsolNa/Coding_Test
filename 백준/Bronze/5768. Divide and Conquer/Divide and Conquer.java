import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int max = 0;
            int x = 0;

            if(m == 0 && n == 0) break;

            for (int i = n; i >= m; i--) {

                int cnt = 0;
                for (int j = 1; j <= i; j++)
                    if(i % j == 0) cnt++;

                if(max < cnt) {
                    x = i;
                    max = cnt;
                }
            }

            System.out.println(x + " " + max);
        }





    }

}