import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        Map<String, Integer> cross = new HashMap<>();
        for (int i = 0; i < n; i++) cross.put(br.readLine(), i);

        for (int i = 0; i < q; i++) {

            st = new StringTokenizer(br.readLine());
            String start = st.nextToken();
            String end = st.nextToken();

            int idx1 = cross.get(start);
            int idx2 = cross.get(end);

            sb.append(Math.abs(idx1 - idx2) - 1).append("\n");
        }

        System.out.println(sb);

    }
}
