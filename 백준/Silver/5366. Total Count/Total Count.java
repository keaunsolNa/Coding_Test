import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        Map<String, Integer> map = new LinkedHashMap<>();
        int total = 0;
        while (true)
        {
            String input = br.readLine();
            if (input.equals("0")) break;
            map.put(input, map.getOrDefault(input, 0) + 1);
            total++;
        }

        for (String key : map.keySet())
        {
            bw.write(key + ": " + map.get(key) + "\n");
        }

        bw.write("Grand Total: " + total);
        bw.flush();
        bw.close();

    }


}
