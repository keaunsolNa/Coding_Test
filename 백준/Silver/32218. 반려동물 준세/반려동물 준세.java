import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            origin[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 1;
        while (true)
        {
            int[] temp = new int[n];

            for (int i = 0; i < n; i++)
            {

                int bigger = 0;
                for (int j = i + 1; j < n; j++)
                {
                    if (origin[i] < origin[j]) bigger++;
                }

                temp[i] = bigger;
            }

            boolean flag = false;
            for (int i = 0; i < n; i++)
            {
                if (origin[i] != temp[i])
                {
                    flag = true;
                    origin[i] = temp[i];
                }
            }

            if (!flag) break;
            else ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }
}