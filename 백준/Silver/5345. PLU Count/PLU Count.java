import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n --> 0)
        {

            char[] input = br.readLine().toUpperCase().toCharArray();
            boolean[] plu = new boolean[3];
            int cnt = 0;

            for (char c : input)
            {

                if (c == 'P' && !plu[0]) plu[0] = true;
                if (c == 'L' && plu[0] && !plu[1]) plu[1] = true;
                if (c == 'U' && plu[0] && plu[1])
                {
                    cnt++;
                    plu[0] = false;
                    plu[1] = false;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);

    }
}

