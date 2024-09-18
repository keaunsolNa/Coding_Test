import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++)
        {
            int key = Integer.parseInt(br.readLine());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        Iterator<Integer> iter = map.keySet().iterator();
        iter.next();
        iter.next();

        int key = iter.next();
        bw.write(key + " " + map.get(key));

        bw.flush();
        bw.close();
        br.close();

    }
}