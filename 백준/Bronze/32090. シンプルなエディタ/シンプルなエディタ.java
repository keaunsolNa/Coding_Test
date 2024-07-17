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

            int cursor = 0;
            StringBuilder in = new StringBuilder();

            while (n --> 0)
            {

                st = new StringTokenizer(br.readLine());
                String order = st.nextToken();
                String target = st.nextToken();

                switch (order)
                {
                    case "INSERT" : in.insert(cursor, target); cursor++; break;
                    case "LEFT" : cursor = Math.max(0, cursor - 1); break;
                    case "RIGHT" : cursor = Math.min(in.length(), cursor + 1); break;
                }

            }
            sb.append(in).append("\n");

        }

        System.out.print(sb);

    }
}

