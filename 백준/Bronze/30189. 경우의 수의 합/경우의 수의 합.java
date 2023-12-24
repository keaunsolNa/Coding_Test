import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ans = 0;
        for(int i = 0; i <= n + m; i++)  {

            int cnt = 0;

            for(int x = 0; x <= n; x++)
                for(int y = 0; y <= m; y++)
                    if(x + y == i) cnt++;

            ans += cnt;
        }

        System.out.println(ans);

    }
}

