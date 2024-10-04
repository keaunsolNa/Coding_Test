import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {

            int input = Integer.parseInt(st.nextToken());
            input = divide(input);

            map.put(input, map.getOrDefault(input, 0) + 1);
            ans = Math.max(ans, map.get(input));

        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int divide (int target)
    {
        if (target % 2 == 1) return target;
        else return divide(target / 2);
    }
}
