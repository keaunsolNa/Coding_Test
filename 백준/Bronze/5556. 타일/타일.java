import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        while(k --> 0) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x > (n + 1) / 2) x = n + 1 - x;
            if(y > (n + 1) / 2) y = n + 1 - y;

            int temp = Math.min(x, y);

            System.out.println(temp % 3 == 1 ? '1' : temp % 3 == 2 ? '2' : '3');
        }
    }
}

