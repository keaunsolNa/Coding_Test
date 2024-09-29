import java.io.*;
import java.util.*;

public class Main {

    private static class Products
    {

        private String name;
        private int point;
        private int day;

        public Products (String name, int point, int day)
        {
            this.name = name;
            this.point = point;
            this.day = day;
        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true)
        {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int cant = 0;
            Map<String, Products> map = new HashMap<>();

            for (int i = 0; i < n; i++)
            {

                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int point = Integer.parseInt(st.nextToken());
                int day = Integer.parseInt(st.nextToken());

                map.put(name, new Products(name, point, day));

            }

            int c = Integer.parseInt(br.readLine());
            for (int i = 0; i < c; i++)
            {

                st = new StringTokenizer(br.readLine());
                int number = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                long total = 0;
                boolean can = true;

                for (int j = 0; j < p; j++)
                {
                    String name = br.readLine();

                    if (!map.containsKey(name)) continue;

                    if (map.get(name).day <= m)
                    {
                        total += map.get(name).point;
                    }
                    else can = false;
                }

                bw.write(number + " " + total + " " + (!can ? "*" : "") + "\n");
                if (!can) cant++;
            }

            bw.write("Number of discontented customers is: " + cant + "\n");
        }


        bw.flush();
        bw.close();
        br.close();

    }


}
