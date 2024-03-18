import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {

            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);

        }

        int max = 0;
        String[] answer = new String[2];
        for (String key : map.keySet()) {

            if(max <= map.get(key)) {
                max = map.get(key);
                answer[0] = key;
                answer[1] = String.valueOf(map.get(key));
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }


}
