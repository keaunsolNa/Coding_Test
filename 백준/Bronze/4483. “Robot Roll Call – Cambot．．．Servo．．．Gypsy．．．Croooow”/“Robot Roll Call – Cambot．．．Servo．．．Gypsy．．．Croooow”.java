import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++)
        {
            int n = Integer.parseInt(br.readLine());
            Map<String, Boolean> map = new LinkedHashMap<>();
            while (n --> 0) map.put(br.readLine(), false);

            int line = Integer.parseInt(br.readLine());
            while (line --> 0)
            {
                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens())
                {
                    String token = st.nextToken();
                    if (map.containsKey(token)) map.put(token, true);
                }
            }

            bw.write("Test set " + i + ":\n");
            for (String key : map.keySet())
            {
                bw.write(map.get(key) ? key + " is present" : key + " is absent");
                bw.write("\n");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}