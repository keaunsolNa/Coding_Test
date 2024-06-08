import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] map = new char[] {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {

            char[] ctr = br.readLine().toCharArray();

            StringBuilder in = new StringBuilder();
            for (int j = 0; j < ctr.length; j++) {

                if (ctr[j] == ' ') in.append(" ");
                else in.append(map[ctr[j] - 'a']);
            }

            sb.append("Case #").append(i).append(": ").append(in).append("\n");
        }

        System.out.println(sb);

    }


}