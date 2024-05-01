import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i ++) list.add(i + 1);

        int n = Integer.parseInt(br.readLine());

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());

            String operator = st.nextToken();
            int operand = Integer.parseInt(st.nextToken());

            switch (operator) {

                case "ADD" : list.replaceAll(num -> num + operand); break;

                case "MULTIPLY" : list.replaceAll(num -> num * operand); break;

                case "SUBTRACT" :
                    list.removeIf(num -> num - operand < 0);
                    list.replaceAll(num -> num - operand);
                    break;

                case "DIVIDE" :
                    list.removeIf(num -> num % operand != 0);
                    list.replaceAll(num -> num / operand);
                    break;
            }

        }

        System.out.println(100 - list.size());

    }
}
