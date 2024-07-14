import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true)
        {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            st = new StringTokenizer(br.readLine());
            int total = 0;
            for (int i = 0; i < n; i++)
            {

                int price = Integer.parseInt(st.nextToken());
                if (total + price <= 300) total += price;

            }
            sb.append(total).append("\n");
        }

        System.out.println(sb);
    }
}

