import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] charSequence = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                                      'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                                      'U', 'V', 'W', 'X', 'Y', 'Z'};

        int k = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();

        for (int i = 0; i < str.length; i++) {

            int idx = str[i] - 'A';
            int term = 3 * (i + 1) + k;
            term = term % 26;

            idx = idx - term >= 0 ? idx - term : 26 + idx - term;
            sb.append(charSequence[idx]);
        }

        System.out.println(sb);
    }


}