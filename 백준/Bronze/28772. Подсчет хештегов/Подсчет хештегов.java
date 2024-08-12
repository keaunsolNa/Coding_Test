import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();

            if (token.startsWith("#") && token.length() >= 2 && countChar(token, '#') == 1) map.put(token, map.getOrDefault(token, 0) + 1);
        }

        bw.write(map.size() + "\n");
        for (String key : map.keySet())
        {
            bw.write(key + " " + map.get(key) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}



