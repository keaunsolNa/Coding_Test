import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] sequence = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                                      'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                                      'U', 'V', 'W', 'X', 'Y', 'Z', '_', '.'};

        while (true) {

            st = new StringTokenizer(br.readLine());

            int term = Integer.parseInt(st.nextToken());
            if (term == 0) break;

            StringBuilder sbInput = new StringBuilder(st.nextToken()).reverse();
            char[] str = sbInput.toString().toCharArray();

            for (int i = 0; i < str.length; i++) {

                int idx = str[i] == '_' ? 26 : str[i] == '.' ? 27 : str[i] -'A';
                idx = (idx + term) % 28;

                sb.append(sequence[idx]);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }


}
