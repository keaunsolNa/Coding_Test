import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String input = "";
        while ((input = br.readLine()) != null) {

            if (input.equals("#")) break;
            Map<String, Integer> map = new HashMap<>();

            while (true) {
                st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                if (name.equals("00A")) break;
                char code = st.nextToken().charAt(0);

                map.put(name, map.getOrDefault(name, 0) + solve(code));
            }

            int total = 0;
            for (String key : map.keySet())
            {
                if (map.get(key) >= 200) total += map.get(key) / 200;
            }

            bw.write(input + " " + total + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int solve(Character code) {

        return switch (code) {
            case 'N' -> 40;
            case 'D', 'R', 'O' -> 100;
            case 'L' -> 120;
            case 'B', 'S' -> 150;
            case 'C' -> 160;
            default -> 0;
        };

    }
}



