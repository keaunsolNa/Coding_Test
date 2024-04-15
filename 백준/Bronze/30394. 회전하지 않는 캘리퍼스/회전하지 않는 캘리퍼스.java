import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            maxY = Math.max(y, maxY);
            minY = Math.min(y, minY);

        }

        System.out.println(maxY - minY);



    }

}