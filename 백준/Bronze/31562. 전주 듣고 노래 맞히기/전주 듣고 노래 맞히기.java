import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> sing = new HashMap<>();
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            StringBuilder first = new StringBuilder();

            for (int j = 0; j < 3; j++)
                first.append(st.nextToken());

            String key = first.toString();
            if(sing.containsKey(key)) sing.put(key, "?");
            else sing.put(key, name);
        }

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            StringBuilder isKey = new StringBuilder();
            for (int j = 0; j < 3; j++) isKey.append(st.nextToken().charAt(0));

            String key = isKey.toString();

            sb.append(sing.containsKey(key) && sing.get(key).equals("?") ? "?" : sing.containsKey(key) ? sing.get(key) : "!").append("\n");

        }

        System.out.println(sb);

    }

}
