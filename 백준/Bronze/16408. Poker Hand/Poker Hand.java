import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 5; i++) {

            String temp = st.nextToken();
            char target = temp.charAt(0);
            map.put(target, map.getOrDefault(target, 0) + 1);
        }

        int max = 0;
        for(Character key : map.keySet()) {
            max = Math.max(map.get(key), max);
        }

        System.out.println(max);

    }
}