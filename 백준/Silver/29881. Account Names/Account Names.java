import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Map<String, String[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            map.put(a, new String[]{b, null});
        }

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            map.get(a)[1] = b;
        }

        for (String key : map.keySet()) {

            sb.append(map.get(key)[0]).append(" ").append(map.get(key)[1]).append("\n");
        }

        System.out.println(sb);
    }


}
