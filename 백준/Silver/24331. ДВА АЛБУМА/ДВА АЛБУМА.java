import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        while (n --> 0) map.put(Integer.parseInt(st.nextToken()), 1);

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (m --> 0)
        {

            int key = Integer.parseInt(st.nextToken());
            if (map.containsKey(key))
            {

                cnt++;
                list.add(key);
            }
        }

        System.out.println(cnt);
        Collections.sort(list);
        for (int key : list) sb.append(key).append(" ");
        if (!sb.isEmpty()) System.out.print(sb);
    }

}

