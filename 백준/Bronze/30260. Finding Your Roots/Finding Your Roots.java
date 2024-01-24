import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int i = 1; i <= t; i++) {

            st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int[] parent = new int[n + 1];
            st = new StringTokenizer(br.readLine());

            for(int p = 1; p <= n; p++) parent[p] = Integer.parseInt(st.nextToken());

            int generations = countG(l, parent);
            sb.append("Data Set ").append(i).append(": \n").append(generations).append("\n").append("\n");
        }

        System.out.print(sb);

    }

    private static int countG(int l, int[] parent) {

        int generations = 0;
        int currentLion = l;

        while (currentLion != 0) {
            generations++;
            currentLion = parent[currentLion];
        }

        return generations;
    }

}