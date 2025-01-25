import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        boolean check = false;

        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {

                String sub = s.substring(0, i);
                boolean flag = true;
                for (int j = i; j < n; j += i)
                {
                    String next = s.substring(j, j + i);
                    if (!sub.equals(next))
                    {
                        flag = false;
                        break;
                    }
                }

                if (flag)
                {
                    check = true;
                    break;
                }
            }
        }

        bw.write(!check ? "No" : "Yes");
        bw.flush();
        bw.close();
        br.close();

    }

}
