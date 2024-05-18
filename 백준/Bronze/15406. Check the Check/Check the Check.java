import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long totalPay = 0;

        while (true) {

            String name = br.readLine();

            if (name.equals("TOTAL")) {

                long total = Long.parseLong(br.readLine());
                System.out.println(total > totalPay ? "PROTEST" : "PAY");
                return;

            }

            st = new StringTokenizer(br.readLine());

            long pay = Integer.parseInt(st.nextToken());
            long cnt = Integer.parseInt(st.nextToken());

            totalPay += (pay * cnt);

        }


    }

}
