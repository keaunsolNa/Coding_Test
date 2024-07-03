import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {

            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) list.add(Integer.parseInt(st.nextToken()));

            int total = 0;
            for (int i = 1; i <= n; i++) {

                int idx = list.indexOf(i);

                for (int j = idx; j > 0; j--) {

                    if (list.get(j) < list.get(j - 1)) {
                        total++;
                        int temp = list.get(j);
                        list.set(j, list.get(j - 1));
                        list.set(j - 1, temp);
                    }
                }

            }

            sb.append("Optimal train swapping takes ").append(total).append(" swaps.").append("\n");
        }

        System.out.println(sb);
    }


}