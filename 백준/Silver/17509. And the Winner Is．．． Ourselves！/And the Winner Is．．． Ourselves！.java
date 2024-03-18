import java.io.*;
import java.util.*;

public class Main {

    private static class Pair {

        int time;
        int count;

        public Pair (int time, int count) {

            this.time = time;
            this.count = count;
        }

    }
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Pair[] pairs = new Pair[11];

        for (int i = 0; i < 11; i++) {

            st = new StringTokenizer(br.readLine());
            pairs[i] = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(pairs, Comparator.comparingInt(o -> o.time));

        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 11; i++) {

            sum += cnt + pairs[i].time;
            cnt += pairs[i].time;

        }

        for (int i = 0; i < 11; i++) 
            sum += (20 * pairs[i].count);

        System.out.println(sum);
    }


}
