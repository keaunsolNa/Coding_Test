import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String input = br.readLine().toLowerCase();
        sb.append(input).append("\n");

        for (int i = 0; i < input.length() - 1; i++) {

            if (input.charAt(i) == 's' && input.charAt(i + 1) == 's') {
                String temp1 = input.substring(0, i);
                String temp2 = input.substring(i + 2);
                sb.append(temp1).append('B').append(temp2).append("\n");
            }
        }

        System.out.println(sb);



    }

}
