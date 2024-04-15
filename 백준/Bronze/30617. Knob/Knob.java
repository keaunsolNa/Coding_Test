import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int[] position = new int[2];
        int ans = 0;

        for (int i = 0; i < t; i++) {

            st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (i > 0) {

                if (position[0] == l && position[0] != 0) ans++;
                if (position[1] == r && position[1] != 0) ans++;
            }

            if (l == r && l != 0) ans++;

            position[0] = l;
            position[1] = r;
        }

        System.out.println(ans);


    }

}