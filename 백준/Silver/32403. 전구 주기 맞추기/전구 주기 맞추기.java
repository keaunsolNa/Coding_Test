import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= t; i++)
        {
            if (t % i == 0) list.add(i);
        }

        int total = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            int min = 9999;
            for (int l : list)
            {
                min = Math.min(min, Math.abs(l - temp));
            }
            total += min;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }

}
