import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < (n * (n - 1) / 2); i++) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (c == d) {

                map.put(a, map.getOrDefault(a, 0) + 1);
                map.put(b, map.getOrDefault(b, 0) + 1);

            }

            else if(c > d) map.put(a, map.getOrDefault(a, 0) + 3);
            else map.put(b, map.getOrDefault(b, 0) + 3);

        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        int prev = entryList.get(0).getValue();
        int rank = 1;
        int dup = 0;
        arr[entryList.get(0).getKey()] = rank;

        for (int i = 1; i < n; i++) {

            if(prev != entryList.get(i).getValue()) {
                rank++;
                rank += dup;
                dup = 0;
            } else dup++;

            prev = entryList.get(i).getValue();
            arr[entryList.get(i).getKey()] = rank;
        }

        for (int i = 1; i <= n; i++) {

            System.out.println(arr[i]);
        }
    }

}
