import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = 1440;
        int max = 0;
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sh = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int eh = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());

            int start = sh * 60 + sm;
            int end = eh * 60 + em;

            int term = end - start > 0 ? end - start : 1440 + (end - start);

            min = Math.min(term, min);
            max = Math.max(term, max);
        }

        System.out.println(min / 60 + ":" + ((min % 60) < 10 ? "0" + (min % 60) : min % 60));
        System.out.println(max / 60 + ":" + ((max % 60) < 10 ? "0" + (max % 60) : max % 60));
    }


}