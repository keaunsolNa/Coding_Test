import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int ans = 0;
        while(n --> 0) {

            int speed = Integer.parseInt(br.readLine());

            ans += speed;
            if(n != 0 && ans > s) ans--;
        }

        System.out.println(ans);


    }
}