import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Character> notes = new ArrayList<>();
        notes.add('A');
        notes.add('B');
        notes.add('C');
        notes.add('D');
        notes.add('E');
        notes.add('F');
        notes.add('G');

        while (true) {

            String temp = br.readLine();
            char[] input = temp.toCharArray();

            if (temp.equals("#")) break;

            int prev = notes.indexOf(input[0]);
            boolean isBeautiful = true;
            for (int i = 1; i < input.length; i++) {

                int now = notes.indexOf(input[i]);

                if (now > prev) {

                    if (now - prev != 2 && now - prev != 4 && now - prev != 6) { isBeautiful = false; break; }

                }

                else {

                    if (now - prev != -5 && now - prev != -3 && now - prev != -1) {isBeautiful = false; break; }
                }
                prev = now;
            }

            sb.append(isBeautiful ? "That music is beautiful." : "Ouch! That hurts my ears.").append("\n");

        }

        System.out.print(sb);
    }
}
