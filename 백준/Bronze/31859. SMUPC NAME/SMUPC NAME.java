import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        char[] name = st.nextToken().toCharArray();

        boolean[] check = new boolean[27];
        int cnt = 0;

        for (char c : name) {

            if (!check[c - 'a']) { sb.append(c); check[c - 'a'] = true; }
            else cnt++;
        }

        sb.append(cnt + 4);
        sb.insert(0, n + 1906);
        sb.reverse();
        sb.insert(0, "smupc_");

        System.out.println(sb);

    }

}
