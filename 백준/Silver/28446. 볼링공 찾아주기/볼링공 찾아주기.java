import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int order = Integer.parseInt(st.nextToken());

            if(order == 1) {

                int x = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());

                map.put(w, x);
            }

            else {

                int w = Integer.parseInt(st.nextToken());
                sb.append(map.get(w)).append("\n");
            }
        }

        System.out.print(sb);
    }
}