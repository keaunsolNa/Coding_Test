import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && w == 0 && l == 0 && h == 0 && a == 0 && m == 0) break;
            long area = (long) w * l;
            area += (long) w * h * 2;
            area += (long) l * h * 2;

            while(m --> 0) {

                st =  new StringTokenizer(br.readLine());
                int ww = Integer.parseInt(st.nextToken());
                int wh = Integer.parseInt(st.nextToken());
                area -= (long) ww * wh;
            }

            area *= n;

            System.out.println(area % a == 0 ? area / a : area / a + 1);
        }
    }
}