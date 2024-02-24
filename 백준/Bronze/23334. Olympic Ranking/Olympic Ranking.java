import java.io.*;
import java.util.*;

public class Main {

    private static class Nation {

        String name;
        int gold;
        int silver;
        int bronze;

        public Nation(String name, int gold, int silver, int bronze) {
            this.name = name;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Nation[] nations = new Nation[n];

        while(n --> 0) {

            st = new StringTokenizer(br.readLine());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            StringBuilder name = new StringBuilder();
            while(st.hasMoreTokens()) name.append(st.nextToken()).append(" ");

            nations[n] = new Nation(name.toString(), gold, silver, bronze);

        }

        Arrays.sort(nations, ((o1, o2) -> {

            if(o1.gold != o2.gold) return  o2.gold - o1.gold;

            else if (o1.silver != o2.silver) return o2.silver - o1.silver;

            else return o2.bronze - o1.bronze;
        }));

        System.out.println(nations[0].name);
    }
}