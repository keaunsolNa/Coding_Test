import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        String now;
        String prev = "";
        boolean isFirst = true;

        for (int i = 0; i < input.length; i++) {

            char temp = i + 1 < input.length && (input[i + 1] != 'A' && input[i + 1] != 'B' && input[i + 1] != 'C') ? input[i + 1] : '0';
            now = input[i] + "" + temp;

            if (i + 1 < input.length && (input[i + 1] == '+' || input[i + 1] == '-' || input[i + 1] == '0')) i++;

            if (now.contains("C")) sb.append("B");

            else if (now.equals("B0") || now.equals("B-")) {

                if (isFirst || prev.contains("C")) sb.append("D");
                else sb.append('B');

            }

            else if (now.equals("B+") || now.equals("A-")) {

                if (isFirst || (prev.contains("C") || prev.equals("B0") || prev.equals("B-"))) sb.append("P");
                else sb.append("D");
            }

            else if (now.equals("A0")) {

                if (isFirst || (prev.contains("B") || prev.contains("C") || prev.equals("A-"))) sb.append("E");
                else sb.append("P");
            }

            else if (now.equals("A+")) sb.append("E");

            isFirst = false;
            prev = now;

        }

        System.out.println(sb);

    }
}
