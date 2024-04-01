import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c3 = Integer.parseInt(st.nextToken());
        int d3 = Integer.parseInt(st.nextToken());

        int h = Integer.parseInt(br.readLine());

        h -= d1;
        h -= d2;
        h -= d3;

        if (h <= 0) {
            System.out.println(0);
            return;
        }

        int t = 0;
        while (h > 0) {

            t++;

            if (t % c1 == 0) h -= d1;
            if (t % c2 == 0) h -= d2;
            if (t % c3 == 0) h -= d3;
        }

        System.out.println(t);

    }


}