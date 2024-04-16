import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());

            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if (day == 0 && month == 0 && year == 0) break;

            boolean flag = true;

            try {

                LocalDate date = LocalDate.of(year, month, day);

            } catch (DateTimeException e) {

                flag = false;
            }

            System.out.println(flag ? "Valid" : "Invalid");

        }

    }

}
