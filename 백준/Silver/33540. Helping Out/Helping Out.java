import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int point = Integer.parseInt(st.nextToken());
            map.put(name, map.getOrDefault(name, 0) + point);
        }

        for (String name : map.keySet())
        {
            bw.write(name + " " + map.get(name) +"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
