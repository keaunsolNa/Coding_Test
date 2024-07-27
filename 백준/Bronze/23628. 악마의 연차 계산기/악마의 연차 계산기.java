import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long sYear = Integer.parseInt(st.nextToken());
        long sMonth = Integer.parseInt(st.nextToken());
        long sDay = Integer.parseInt(st.nextToken());
        long start = (sYear * 360) + (sMonth * 30) + sDay;

        st = new StringTokenizer(br.readLine());

        long eYear = Integer.parseInt(st.nextToken());
        long eMonth = Integer.parseInt(st.nextToken());
        long eDay = Integer.parseInt(st.nextToken());
        long end = (eYear * 360) + (eMonth * 30) + eDay;

        if (start == end)
        {
            System.out.println(0 + " " + 0);
            System.out.println("0days");
            return;
        }

        long n = (end - start) / 360;
        long m = (end - start) / 30;

        if (m <= 36)
        {
            System.out.println((n * 15) + " " + m);
            System.out.println(end - start + "days");
        }
        else
        {
            long total = n * 15;
            n++;
            while (n --> 0)
            {
                long a = n % 2 == 0 ? n / 2 - 1 : n / 2;
                total += a;
            }

            total++;
            System.out.println(total + " " + 36);
            System.out.println(end - start +"days");
        }
    }
}