import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= n; tc++) {

            int g = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            sb.append("Case #").append(tc).append(": ");

            for(int i = 0; i < g; i++) {

                int temp = Integer.parseInt(st.nextToken());
                if(!list.contains(temp))  list.add(temp);
                else list.remove((Object) temp);
            }

            sb.append(list.get(0)).append("\n");
        }

        System.out.print(sb.deleteCharAt(sb.length() - 1));

    }
}
