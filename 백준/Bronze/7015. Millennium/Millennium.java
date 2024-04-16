import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int total = 0;
            int now = 0;

            for (int i = 1; i < 1000; i++) {

                if (i % 3 == 0) total += 20 * 10;
                else total += (20 + 19) * 5;

            }

            total += 1;

            for (int i = 1; i < y; i++) {

                if (i % 3 == 0) now += 20 * 10;
                else now += (20 + 19) * 5;

            }

            if (y % 3 == 0) now += (m - 1) * 20 + d;
            else now += (int) (Math.ceil((m - 1) / 2.0) * 20 + Math.floor((m - 1) / 2.0) * 19 + d);

            System.out.println(total - now);

        }
    }

}
