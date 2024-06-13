import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {

            String token = st.nextToken();
            char[] arr = token.toCharArray();

            int left = 0;
            int right = 0;
            boolean isLeft = true;
            for (char c : arr) {

                if (c == '\'') {

                    if (isLeft) left++;
                    else right++;
                }

                else isLeft = false;
            }

            token = token.replaceAll("'", "");
            if (right == 0) sb.append(token.substring(left));
            else sb.append(token, left, token.length() - right);

        }

        System.out.print(sb);


    }


}