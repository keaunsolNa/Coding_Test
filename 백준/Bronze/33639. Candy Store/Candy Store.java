import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        Map<String, List<String>> map = new HashMap<>();

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            String second = st.nextToken();

            String key = first.charAt(0) + "" + second.charAt(0);
            if (map.containsKey(key))
            {
                map.get(key).add(first + " " + second);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(first + " " + second);
                map.put(key, list);
            }
        }

        while (q  --> 0)
        {
            String key = br.readLine();
            if (map.containsKey(key) && map.get(key).size() > 1) bw.write("ambiguous\n");
            else if (map.containsKey(key) && map.get(key).size() == 1) bw.write(map.get(key).get(0) + "\n");
            else if (!map.containsKey(key)) bw.write("nobody\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}