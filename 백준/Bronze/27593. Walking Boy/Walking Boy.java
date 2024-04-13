import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            int amount = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int prev = 0, now, walk = 0;

            for (int i = 0; i < amount; i++) {

                now = Integer.parseInt(st.nextToken());
                if (now - prev >= 120) walk += ((now - prev) / 120);

                prev = now;
            }

            walk += ((1440 - prev) / 120);
            System.out.println(walk >= 2 ? "YES" : "NO");
        }

    }
}