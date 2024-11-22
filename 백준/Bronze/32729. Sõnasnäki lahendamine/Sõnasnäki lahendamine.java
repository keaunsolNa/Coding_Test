import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input)
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int n = Integer.parseInt(br.readLine());

        while (n --> 0)
        {

            String inStr = br.readLine();
            char[] in = inStr.toCharArray();
            if (in.length > input.length) continue;
            Map<Character, Integer> temp = new HashMap<>();

            for (char c : in)
            {
                temp.put(c, temp.getOrDefault(c, 0) + 1);
            }

            boolean flag = true;
            for (char c : temp.keySet())
            {

                if (!(map.containsKey(c) && temp.containsKey(c)))
                {
                    flag = false;
                    break;
                }
                if (map.get(c) < temp.get(c))
                {
                    flag = false;
                    break;
                }
            }

            if (flag) bw.write(inStr + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
