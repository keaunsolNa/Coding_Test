import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            Map<String, int[]> map = new HashMap();
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            for(int i = 0; i < c; i++) {

                st = new StringTokenizer(br.readLine());
                String n = st.nextToken();
                int sp = Integer.parseInt(st.nextToken());
                int mp = Integer.parseInt(st.nextToken());
                int lp = Integer.parseInt(st.nextToken());

                map.put(n, new int[]{sp, mp, lp});
            }

            Map<String, Integer> priceMap = new LinkedHashMap<>();
            for(int i = 0; i < p; i++) {

                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String size = st.nextToken();
                String coffee = st.nextToken();

                switch (size) {
                    case "small" : priceMap.put(name, priceMap.getOrDefault(name, 0) + map.get(coffee)[0]); break;
                    case "medium" : priceMap.put(name, priceMap.getOrDefault(name, 0) + map.get(coffee)[1]); break;
                    case "large" : priceMap.put(name, priceMap.getOrDefault(name, 0) + map.get(coffee)[2]); break;
                }
            }

            int delivery = 100 / p;
            for (String key :
                    priceMap.keySet()) {

                if((priceMap.get(key)  + delivery) % 5 == 1) priceMap.put(key, priceMap.get(key) + delivery - 1);
                else if((priceMap.get(key) + delivery) % 5 == 4) priceMap.put(key, priceMap.get(key) + delivery + 1);
                else priceMap.put(key, priceMap.get(key) + delivery);

                sb.append(key).append(" ").append(priceMap.get(key)).append("\n");
            }

            System.out.println(sb.deleteCharAt(sb.length() - 1));
            sb.setLength(0);
        }

    }

}