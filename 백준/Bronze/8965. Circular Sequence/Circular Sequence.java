import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {

            String str = br.readLine();
            char[] seq = str.toCharArray();

            for (int i = 0; i < seq.length; i++) {

                StringBuilder temp = new StringBuilder();

                for (int j = i; j < i + seq.length; j++) {

                    temp.append(seq[j % seq.length]);
                }

                str = str.compareTo(temp.toString()) < 0 ? str : temp.toString();
            }
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }


}
