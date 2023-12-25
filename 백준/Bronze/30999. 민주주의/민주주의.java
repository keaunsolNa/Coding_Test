import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int ans = 0;

        for(int i = 0; i < n; i++) {

            char[] temp = br.readLine().toCharArray();
            int tem = 0;
            for(int j = 0; j < m; j++)
                if(temp[j] == 'O') tem++;

            if(tem > m / 2) ans++;
        }

        System.out.println(ans);


    }

}

