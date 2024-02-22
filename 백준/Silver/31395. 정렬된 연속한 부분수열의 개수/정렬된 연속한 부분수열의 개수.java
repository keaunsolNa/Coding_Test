import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), prev = 0, cur = 0;
        long ans = 0, len = 0;

        st = new StringTokenizer(br.readLine());
        while(n --> 0) {

            cur = Integer.parseInt(st.nextToken());

            if(cur > prev) ++len;
            else {
                ans += (len + 1) * len / 2;
                len = 1;
            }

            prev = cur;
        }

        System.out.println(ans += (len + 1) * len / 2);



    }


}