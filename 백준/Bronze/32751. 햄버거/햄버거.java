import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        char[] input = str.toCharArray();

        if (str.equals("aa"))
        {
            System.out.println("No");
            System.exit(0);
        }

        if (!str.endsWith("a") || !str.startsWith("a"))
        {
            bw.write("No");
        }

        else
        {

            Map<Character, Integer> map = new HashMap<>();
            
            map.put('a', a);
            map.put('b', b);
            map.put('c', c);
            map.put('d', d);
            
            char prev = input[0];
            map.put('a', map.get('a') - 1);
            boolean flag = true;

            for (int i = 1; i < n; i++)
            {
                map.put(input[i], map.get(input[i]) - 1);
                if (input[i] == prev)
                {
                    flag = false;
                    break;
                }

                if (map.get(input[i]) < 0)
                {
                    flag = false;
                    break;
                }

                prev = input[i];
            }

            if (flag) bw.write("Yes");
            else bw.write("No");

        }
        bw.flush();
        bw.close();
        br.close();

    }


}
