import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            int n = Integer.parseInt(br.readLine());
            StringBuilder in = new StringBuilder();
            String s = "abcdefghijklmnopqrstuvwxyz";

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {

                int idx = Integer.parseInt(st.nextToken());
                char letter = s.charAt(idx);
                in.append(letter);

                String start = s.substring(0, idx);
                String end = s.substring(idx + 1);

                s = letter + start + end;
            }

            sb.append(in).append("\n");
        }

        System.out.println(sb);



    }

}
