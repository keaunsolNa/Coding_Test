import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String input;

        while (n --> 0)
        {
            Map<String, Integer> map = new HashMap<>();
            int idx = 1;


            while((input = br.readLine()) != null && ! input.isEmpty())
            {
                st = new StringTokenizer(input);
                while (st.hasMoreTokens())
                {
                    String key = st.nextToken();
                    if (map.containsKey(key)) bw.write(String.valueOf(map.get(key)));
                    else
                    {
                        bw.write(key);
                        map.put(key, idx++);
                    }
                    bw.write(" ");
                }

                bw.write("\n");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
