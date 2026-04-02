import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Character, Character[]> map = new HashMap<>();

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine());
            char x = st.nextToken().charAt(0);
            int m = Integer.parseInt(st.nextToken());
            Character[] role = new Character[m];

            for (int i = 0; i < m; i++) {
                char target = st.nextToken().charAt(0);
                role[i] = target;
            }

            map.put(x, role);
        }

        char[] s = br.readLine().toCharArray();
        boolean check = true;

        for (int i = 0; i < s.length; i++) {

            char c = s[i];
            if (map.containsKey(c)) {
                Character[] role = map.get(c);

                if (i < s.length - 1) {

                    char next = s[i + 1];
                    check = Arrays.stream(role).anyMatch(x -> x == next);
                }
            }

            if (!check) break;
        }

        bw.write(check ? "yes" : "no");

        bw.flush();
        bw.close();
    }
}