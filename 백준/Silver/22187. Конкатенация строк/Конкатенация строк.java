import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean flag = false;
        char[] input = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        for (char c : input) {

            if (c == '(') {
                flag = true;
            }

            else if (c == ')') {

                flag = false;
                sb.append(reverse.reverse());
                reverse.setLength(0);
            }

            else if (!flag) sb.append(c);

            else reverse.append(c);
        }

        System.out.print(sb);
    }


}