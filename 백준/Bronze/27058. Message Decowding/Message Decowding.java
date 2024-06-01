import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] key = br.readLine().toCharArray();
        char[] target = br.readLine().toCharArray();

        for (char c : target) {

            if (c == ' ') sb.append(" ");
            else if ((int)c > 90) {

                c -= 'a';
                sb.append(key[c]);
            }
            else {

                c -= 'A';
                sb.append((key[c] + "").toUpperCase());
            }
        }

        System.out.println(sb);
    }


}
