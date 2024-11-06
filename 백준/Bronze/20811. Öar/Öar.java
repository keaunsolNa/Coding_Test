import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] pibo = new int[30];
        pibo[0] = 1;
        pibo[1] = 1;
        int ans = 0;
        int now = n - 2;
        for (int i = 2; i < 30; i++)
        {
            pibo[i] = pibo[i - 1] + pibo[i - 2];
            now -= pibo[i];

            if (now <= 0)
            {
                ans = i + 1;
                break;
            }

        }

        if (n == 1)
        {
            bw.write(String.valueOf(n));
        }
        else if (n <= 3)
        {
            bw.write("2");
        }
        else
        {
            bw.write(String.valueOf(ans));
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
