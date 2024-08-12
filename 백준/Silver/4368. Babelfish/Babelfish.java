import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Map<String, String> map = new HashMap<>();
        while (true)
        {
            String input = br.readLine();
            if (input.isEmpty()) break;

            st = new StringTokenizer(input);
            String value = st.nextToken();
            String key = st.nextToken();

            map.put(key, value);
        }

        String input = "";
        while ((input = br.readLine()) != null)
        {

            bw.write(map.getOrDefault(input, "eh"));

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }


}



