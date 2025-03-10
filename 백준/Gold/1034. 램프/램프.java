import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] count = new int[n];
        String[] line = new String[n];

        for (int i = 0; i < n; i++)
        {
            String s = br.readLine();
            int off = 0;

            for (int j = 0; j < m; j++)
            {
                if (s.charAt(j) == '0') off++;
            }

            count[i] = off;
            line[i] = s;

        }

        int k = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++)
        {

            if (count[i] <= k && (k - count[i]) % 2 == 0)
            {

                int equal = 1;

                for (int j = 0; j < n; j++)
                {

                    if (i == j) continue;
                    if (line[i].equals(line[j])) equal++;
                }

                max = Math.max(max, equal);
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }


}