import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while (m --> 0) {

            st = new StringTokenizer(br.readLine());
            List<Integer> minusList = new ArrayList<>();
            long sum = 0;

            boolean zero = false;
            for (int i = 0; i < n; i++) {

                int temp = Integer.parseInt(st.nextToken());
                if (temp > 0)
                {
                    if (sum == 0) sum = 1;
                    sum *= temp;
                }
                else if (temp < 0) minusList.add(temp);
                else zero = true;
            }

            Collections.sort(minusList);


            if (minusList.size() <= 1)
            {
                if (!zero && sum == 0) sum = minusList.get(minusList.size() - 1);
                bw.write(sum + "\n");
                continue;
            }

            for (int i = 0; i < minusList.size() - 1; i += 2) {

                if (sum == 0) sum = 1;
                sum *= minusList.get(i);
                sum *= minusList.get(i + 1);
            }

            bw.write(sum + "\n");
        }


    }

}