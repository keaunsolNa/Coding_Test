import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true)
        {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (w == 0 && n == 0) break;
            StringBuilder sb = new StringBuilder();

            Map<String, Integer> map = new LinkedHashMap<>();
            while (n --> 0)
            {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String code = st.nextToken();

                switch (code)
                {
                    case "TT" : map.put(name, map.getOrDefault(name, 0) + 75); break;
                    case "TX" : map.put(name, map.getOrDefault(name, 0) + 50); break;
                    case "PR" : map.put(name, map.getOrDefault(name, 0) + 80); break;
                    case "RT" : map.put(name, map.getOrDefault(name, 0) + 30); break;
                    case "AP" : map.put(name, map.getOrDefault(name, 0) + 25); break;
                    case "PX" : map.put(name, map.getOrDefault(name, 0) + 60); break;
                }

            }
            sb.append("Week ").append(w).append(" ");
            for (String key : map.keySet())
            {
                if (map.get(key) >= 100) sb.append(key).append(",");
            }

            if (sb.charAt(sb.length() - 1) == ',') sb.deleteCharAt(sb.length() - 1);
            else sb.append("No phones confiscated");

            sb.append("\n");
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
    }
}