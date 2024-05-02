import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String input;
        while ((input = br.readLine()) != null) {

            st = new StringTokenizer(input);

            int d = Integer.parseInt(st.nextToken());
            int vf = Integer.parseInt(st.nextToken());
            int vg = Integer.parseInt(st.nextToken());

            char result = (Math.sqrt(d * d + 144)) / vg > 12.0 / vf ? 'N' : 'S';

            sb.append(result).append("\n");

        }

        System.out.println(sb);
    }

}
