import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        char[] alp = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            st = new StringTokenizer(br.readLine());
            char[] column = st.nextToken().toCharArray();
            char[] input = st.nextToken().toCharArray();

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < input.length; i++) {

                int len = column[i % column.length] - 'A';

                int temp = input[i] - 'A';
                temp = temp + len >= 26 ? temp + len - 26 : temp + len;
                ans.append(alp[temp]);

            }

            sb.append("Ciphertext: ").append(ans).append("\n");

        }

        System.out.print(sb);
    }
}