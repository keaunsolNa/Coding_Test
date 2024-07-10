import java.io.*;
import java.util.*;

public class Main {

    private static class Cable
    {

        private int term;

        public Cable (int di, int bi)
        {

            term = di - bi;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Cable[] cables = new Cable[n];

        for (int i = 0; i < n; i++)
        {

            st = new StringTokenizer(br.readLine());


            cables[i] = new Cable(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(cables, (c1, c2) -> Integer.compare(c2.term,c1.term));

        long total = 0;
        int cnt = 0;
        for (Cable cable : cables)
        {

            if (total + cable.term >= 0)
            {
                total += cable.term;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

