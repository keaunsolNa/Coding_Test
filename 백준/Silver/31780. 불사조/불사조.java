import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Integer[] prev = new Integer[1];
        prev[0] = x;
        long sum = x;

        for (int i = 0; i < m; i++) {

            List<Integer> temp = new ArrayList<>();

            for (Integer integer : prev) {

                int one = integer % 2 == 0 ? integer / 2 : integer / 2 + 1;
                int two = integer / 2;
                temp.add(one);
                temp.add(two);

                sum += one;
                sum += two;
            }

            prev = temp.toArray(Integer[]::new);
        }

        System.out.println(sum);

    }
}
