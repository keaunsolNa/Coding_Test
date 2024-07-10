import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (br.readLine() != null)
        {

            Map<String, Integer> map = new HashMap<>();

            while (true)
            {

                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();

                if (name.equals("END")) break;
                int day = Integer.parseInt(st.nextToken());
                int start = Integer.parseInt(st.nextToken());

                int weight = Math.max(0, start - day);

                map.put(name, weight);
            }

            List<String> keySet = new ArrayList<>(map.keySet());

            keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

            for (String key : keySet)
            {
                sb.append(key).append("\n");
            }

            sb.append("\n");
        }

        System.out.println(sb);


    }
}

