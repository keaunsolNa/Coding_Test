import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int q = Integer.parseInt(br.readLine());

        while (q --> 0) {

            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            String temp = str.substring(l - 1, r);

            int max = 0;
            for (int i = 1; i < temp.length(); i++) {

                String left = temp.substring(0, i);
                String right = temp.substring(i);
                int cnt = 0;

                int minL = Math.min(left.length(), right.length());
                for (int j = 0; j < minL; j++) if (left.charAt(left.length() - j - 1) == right.charAt(j)) cnt++;

                max = Math.max(max, cnt);

            }

            System.out.println(max);
        }

    }


}
