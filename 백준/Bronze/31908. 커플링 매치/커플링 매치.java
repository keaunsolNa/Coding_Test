import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Map<String, List<String>> map = new HashMap<>();
        while (n --> 0) {

            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String ring = st.nextToken();

            if (ring.equals("-")) continue;

            if (map.containsKey(ring)) {

                map.get(ring).add(name);
            }

            else {

                List<String> list = new ArrayList<>();
                list.add(name);
                map.put(ring, list);
            }
        }

        int cnt = 0;
        for (String key : map.keySet()) {

            if (map.get(key).size() == 2) {

                cnt++;
                sb.append(map.get(key).get(0)).append(" ").append(map.get(key).get(1)).append("\n");
            }
        }

        sb.insert(0, cnt + "\n");

        System.out.println(sb);
    }
}
