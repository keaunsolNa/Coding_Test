import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new TreeMap<>();
        while (n-- > 0) {

            String[] token = br.readLine().replaceAll("\\s+", " ").split(" ");
            map.put(token.length, map.getOrDefault(token.length, 0) + 1 );

        }

        for (Integer key : map.keySet())
        {
            bw.write(key + " " + map.get(key) + "\n");
        }
        bw.flush();
        bw.close();

    }


}
