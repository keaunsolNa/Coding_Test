import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            StringBuilder str = new StringBuilder(st.nextToken());

            while (c --> 0) {

                str.insert(0, str.substring(n));
            }

            sb.append(str).append("\n");
        }

        System.out.print(sb);

    }

}