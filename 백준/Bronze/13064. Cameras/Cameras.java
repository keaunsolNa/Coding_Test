import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Character> number = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            number.add((char) (i + '0'));
        }

        while (n --> 0) {

            char[] input = br.readLine().toCharArray();

            if (input.length != 8) continue;
            if (input[0] != input[1]) continue;
            if (!(number.contains(input[0]) && number.contains(input[1]))) continue;
            if (!(number.contains(input[2]) && number.contains(input[3]))) continue;
            if (!(number.contains(input[5]) && number.contains(input[6]) && number.contains(input[7]))) continue;
            if (!((int) input[4] >= 65 && (int) input[4] <= 90)) continue;

            sb.append(new String(input)).append("\n");
        }

        System.out.print(sb);
    }



}