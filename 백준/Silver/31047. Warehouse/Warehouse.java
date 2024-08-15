import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();
            while (n --> 0)
            {
                st = new StringTokenizer(br.readLine());
                String key = st.nextToken();
                int value = Integer.parseInt(st.nextToken());
                map.put(key, map.getOrDefault(key, 0) + value);
            }

            List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
            entryList.sort((o1, o2) -> {

                if (Objects.equals(o1.getValue(), o2.getValue()))
                    return o1.getKey().compareTo(o2.getKey());
                return o2.getValue() - o1.getValue();
            });

            bw.write(map.size() + "\n");
            for (Map.Entry<String, Integer> entry : entryList) {
                bw.write(entry.getKey() + " " + entry.getValue() + "\n");
            }

        }

        bw.flush();
        bw.close();

    }


}
