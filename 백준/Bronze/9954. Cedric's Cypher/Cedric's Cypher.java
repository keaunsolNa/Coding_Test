import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            String input = br.readLine();
            int len = input.length() - 1;

            if (input.equals("#")) break;

            int shift = input.charAt(len) - 'A';

            for (int i = 0; i < len; i++) {

                int charToInt = input.charAt(i);
                int term = (charToInt >= 65 && charToInt <= 90) ? 65 : 97;
                char temp = charToInt - shift < term ? (char)(26 + charToInt - shift) : (char)(charToInt - shift);

                if ((charToInt >= 65 && charToInt <= 90) || (charToInt >= 97 && charToInt <= 122)) {
                    sb.append(temp);
                }

                else sb.append(input.charAt(i));
            }

            sb.append("\n");
        }

        System.out.print(sb.deleteCharAt(sb.length() - 1));
    }


}
