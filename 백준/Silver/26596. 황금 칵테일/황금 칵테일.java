import java.io.*;
import java.util.*;

public class Main {

    private static Map<String, Integer> map;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());

        map = new HashMap<>();
        for(int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int x = Integer.parseInt(st.nextToken());

            map.put(s, map.getOrDefault(s, 0) + x);
        }

        if(check()) System.out.println("Delicious!");
        else System.out.println("Not Delicious...");
    }

    private static boolean check() {

        for(String key : map.keySet()) {

            int value = map.get(key);

            for(String key2 : map.keySet()) {

                int value2 = (int)(map.get(key2) * 1.618);
                if(!key.equals(key2) && value == value2) return true;
            }
        }

        return false;
    }
}