import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        while (idx != input.length() - 1) {

            sb.append(input.charAt(idx));
            idx += input.charAt(idx) - 'A' + 1;

        }

        sb.append(input.charAt(input.length() - 1));
        System.out.println(sb);

    }


}