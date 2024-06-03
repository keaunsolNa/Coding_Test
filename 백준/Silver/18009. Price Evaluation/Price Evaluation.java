import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());

        for (int t = 1; t <= k; t++) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Map<String, Integer> map = new HashMap<>();

            while (n --> 0) {

                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int c = Integer.parseInt(st.nextToken());

                map.put(name, c);
            }

            st = new StringTokenizer(br.readLine());
            int price = 0;
            int question = 0;
            while (m --> 0) {

                String name = st.nextToken();

                if (!name.equals("?")) {

                    price += map.get(name);
                    map.remove(name);
                }

                else question++;
            }

            Integer[] priceArr = new Integer[map.size()];
            int idx = 0;
            for (String key : map.keySet()) {

                int temp = map.get(key);
                priceArr[idx++] = temp;

            }

            Arrays.sort(priceArr);

            int min = price;
            int max = price;

            for (int i = 0; i < question; i++) min += priceArr[i];

            Arrays.sort(priceArr, Collections.reverseOrder());

            for (int i = 0; i < question; i++) max += priceArr[i];

            sb.append("Data Set ").append(t).append(":").append("\n");
            sb.append(min).append(" ").append(max).append("\n");
            sb.append("\n");
        }


        System.out.print(sb);
    }

}
