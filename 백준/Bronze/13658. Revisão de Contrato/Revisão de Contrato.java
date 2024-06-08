import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            String n = st.nextToken();

            if (d.equals("0") && n.equals("0")) break;

            n = n.replaceAll(d, "");

            while(n.startsWith("0")) n = n.replaceFirst("0", "");

            if (n.isEmpty()) n = "0";
            sb.append(n).append("\n");
        }

        System.out.print(sb);

    }


}