import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        Map<Integer, Set<String>> map = new HashMap<>();
        int key = 1;

        while (e --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            Set<String> set = new HashSet<>();
            while (k --> 0) set.add(st.nextToken());

            if (set.contains("1")) map.put(key++, set);
            else
            {
                for (String s : set)
                {
                    for (Set<String> value : map.values())
                    {
                        if (value.contains(s)) value.addAll(set);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++)
        {

            int cnt = 0;
            for (Set<String> value : map.values())
            {
                if (value.contains(String.valueOf(i))) cnt++;
            }

            if (cnt == map.size()) sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
