import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new TreeMap<>();
        while (n --> 0)
        {
            String name = br.readLine();
            StringBuilder key = new StringBuilder();
            boolean flag = false;

            for (char c : name.toCharArray())
            {
                if (flag) key.append(c);
                else if ((int) c >= 65 && c <= 90)
                {
                    flag = true;
                    key.append(c);
                }
            }

            map.put(key.toString(), name);
        }

        for (String key : map.keySet())
        {
            bw.write(map.get(key) + "\n");
        }
        bw.flush();
        br.close();
    }



}
