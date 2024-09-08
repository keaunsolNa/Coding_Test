import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";

        while ((input = br.readLine()) != null)
        {

            char[] a = input.toCharArray();
            char[] b = br.readLine().toCharArray();

            Map<Character, Integer> cA = new HashMap<>();
            Map<Character, Integer> cB = new HashMap<>();
            for (char c : a)
            {
                cA.put(c, cA.getOrDefault(c, 0) + 1);
            }

            for (char c : b)
            {
                cB.put(c, cB.getOrDefault(c, 0) + 1);
            }

            StringBuilder sb = new StringBuilder();

            for (char c : cA.keySet())
            {

                if (cB.containsKey(c))
                {
                    int min = Math.min(cA.get(c) , cB.get(c));
                    sb.append(String.valueOf(c).repeat(Math.max(0, min)));
                }
            }

            bw.write(sb.toString()
                    .chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
