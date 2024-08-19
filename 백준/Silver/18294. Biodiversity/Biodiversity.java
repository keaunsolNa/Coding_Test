import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int total = 0;
        Map<String, Integer> map = new HashMap<>();
        while (n --> 0) {

            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
            total++;
        }

        boolean isOver = false;
        String ans = "";
        for (String key : map.keySet())
        {
            if (total - map.get(key) < map.get(key))
            {
                isOver = true;
                ans = key;
                break;
            }
        }

        bw.write(isOver ? ans : "NONE");
        bw.flush();
        bw.close();
    }
}



