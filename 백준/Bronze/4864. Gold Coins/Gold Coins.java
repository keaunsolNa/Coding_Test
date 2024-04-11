import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int day = Integer.parseInt(br.readLine());
            if (day == 0) break;

            sb.append(day).append(" ");
            int coin = 0;
            int cnt = 1;
            int idx;

            for (int i = 1; i <= day; ) {

                idx = (i + cnt > day) ? day - i + 1 : cnt;

                for (int j = 1; j <= idx; j++) coin += cnt;

                i += cnt;
                cnt++;
            }

            sb.append(coin).append("\n");
        }

        System.out.print(sb);
    }
}
