import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int prev = 0, pointA = 0, pointB = 0, prevTime = 0;
        while (n --> 0) {

            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a <= 4) {

                pointA += 100;
                if (prev == a && t - prevTime <= 10) pointA += 50;

            }

            else {

                pointB += 100;
                if (prev == a && t - prevTime <= 10) pointB += 50;

            }

            prev = a;
            prevTime = t;

        }

        System.out.println(pointA + " " + pointB);

    }
}
