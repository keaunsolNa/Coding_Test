import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] erdaNova = new int[n];
        int[] origin = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) erdaNova[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) origin[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(erdaNova);
        Arrays.sort(origin);

        int prev = erdaNova[0];
        int erdaNovaCount = 1;
        for (int i = 1; i < n; i++) {

            if(erdaNova[i] - prev >= 100) {
                prev = erdaNova[i];
                erdaNovaCount++;
            }
        }

        prev = origin[0];
        int originCount = 1;
        for (int i = 1; i < m; i++) {

            if(origin[i] - prev >= 360) {
                prev = origin[i];
                originCount++;
            }
        }

        System.out.println(erdaNovaCount + " " + originCount);
    }
}
