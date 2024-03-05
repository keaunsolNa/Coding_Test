import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int tc = 1;

        while (true) {

            int t = Integer.parseInt(br.readLine());
            if (t == 0) break;

            Set<Character> set = new TreeSet<>();
            set.add('a');

            for (int i = 0; i < t; i++) {

                st = new StringTokenizer(br.readLine(), " =");

                char var = st.nextToken().charAt(0);
                char value = st.nextToken().charAt(0);

                if(set.contains(value)) set.add(var);
                else set.remove(var);
            }

            sb.append("Program #").append(tc++).append("\n");
            if (!set.isEmpty())
                for (char c : set) sb.append(c).append(" ");

            else sb.append("none");

            sb.append("\n").append("\n");
        }

        System.out.println(sb);

    }
}
