import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<Map<Character, Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            char[] input = br.readLine().toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char c : input)
            {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            list.add(map);
        }

        Map<Character, Integer> costMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        costMap.put('P', Integer.parseInt(st.nextToken()));
        costMap.put('C', Integer.parseInt(st.nextToken()));
        costMap.put('V', Integer.parseInt(st.nextToken()));
        costMap.put('S', Integer.parseInt(st.nextToken()));
        costMap.put('G', Integer.parseInt(st.nextToken()));
        costMap.put('F', Integer.parseInt(st.nextToken()));
        costMap.put('O', Integer.parseInt(br.readLine()));


        long total = 0;
        for (Map<Character, Integer> map : list)
        {

            int cost = 0, amount = 0;
            char key = ' ';
            if (map.size() == 1)
            {
                for (Character keys : map.keySet())
                {
                    key = keys;
                    amount = map.get(keys);
                }
            }
            else
            {
                key = 'O';
                for (Character keys : map.keySet())
                {
                    amount += map.get(keys);
                }
            }

            cost = map.size() == 1 ? Math.min(costMap.get(key) * amount, costMap.get('O') * amount)
                    : costMap.get(key) * amount;
            total += cost;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }
}
