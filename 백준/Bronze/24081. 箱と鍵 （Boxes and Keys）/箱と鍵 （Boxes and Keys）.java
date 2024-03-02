import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] box = new int[n];
        Set<Integer> key = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) box[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) key.add(Integer.parseInt(st.nextToken()));

        int cnt = 0;

        for (int j : box) if (key.contains(j)) cnt++;

        System.out.println(cnt);

    }

}