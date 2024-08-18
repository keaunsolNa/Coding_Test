import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        List<String> winner = new ArrayList<>();
        while (n --> 0)
        {
            String name = br.readLine();
            map.put(name, 0);
        }

        while (m --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int point = Integer.parseInt(st.nextToken());

            map.put(name, map.getOrDefault(name, 0) + point);
            if (map.get(name) >= p && !winner.contains(name))
            {
                bw.write(name + " wins! \n");
                winner.add(name);
            }
        }

        if (winner.isEmpty()) {
            bw.write("No winner!");
        }

        bw.flush();
        bw.close();
    }
}



