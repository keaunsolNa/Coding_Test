import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] hate = new int[n];
        for (int i = 0; i < n; i++) hate[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();
            for (int tp = 0; tp < k; tp++) list.add(Integer.parseInt(st.nextToken()));

            boolean can = true;

            for (int ha : hate) {

                if (list.contains(ha)) {
                    can = false;
                    break;
                }
            }

            if (can) ans++;
        }

        System.out.println(ans);

    }

}
