import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int t1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int h2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());

        double nextFire1 = 0, nextFire2 = 0, time = 0;

        while (h1 >0 && h2 > 0) {

            if (time >= nextFire1) {
                nextFire1 = time + t1;
                h2 -= d1;
            }

            if (time >= nextFire2) {
                nextFire2 = time + t2;
                h1 -= d2;
            }

            time += 0.5;
        }

        System.out.println(h1 > 0 ? "player one" : h2 > 0 ? "player two" : "draw");
    }

}
