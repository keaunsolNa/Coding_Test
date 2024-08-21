import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        while (n --> 0)
        {
            map.put(br.readLine(), 0);
        }

        int m = Integer.parseInt(br.readLine());
        int teamOnePoint = 0, teamTwoPoint = 0;

        while (m --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String[] token = st.nextToken().split(":");
            int teamOneGet = Integer.parseInt(token[0]) - teamOnePoint;
            int teamTwoGet = Integer.parseInt(token[1]) - teamTwoPoint;

            teamOnePoint += teamOneGet;
            teamTwoPoint += teamTwoGet;

            String name = st.nextToken();
            map.put(name, map.getOrDefault(name, 0) + Math.max(teamOneGet, teamTwoGet));

        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        bw.write(entryList.get(0).getKey() + " " + entryList.get(0).getValue());

        bw.flush();
        bw.close();
    }
}