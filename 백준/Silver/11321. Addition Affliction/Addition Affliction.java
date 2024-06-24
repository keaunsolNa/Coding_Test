import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            String input = br.readLine();
            if (input.equals("0")) break;

            int[] numbers = Arrays.stream(input.split("\\+")).mapToInt(Integer::parseInt).toArray();

            boolean[] used = new boolean[numbers.length];
            List<Integer> multiples = new ArrayList<>();
            List<Integer> others = new ArrayList<>();

            for (int i = 0; i < numbers.length; i++) {

                if (used[i]) continue;
                boolean isPairFound = false;

                for (int j = i + 1; j < numbers.length; j++) {

                    if (!used[j] && (numbers[i] + numbers[j]) % 10 == 0) {
                        multiples.add(numbers[i]);
                        multiples.add(numbers[j]);
                        used[i] = used[j] = true;
                        isPairFound = true;
                        break;
                    }
                }

                if (!isPairFound) {
                    others.add(numbers[i]);
                }
            }

            multiples.addAll(others);

            for (int i : multiples) sb.append(i).append("+");

            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");

        }

        System.out.println(sb);
    }


}