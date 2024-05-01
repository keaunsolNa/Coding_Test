import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {

            int n = Integer.parseInt(br.readLine());
            boolean[] check = new boolean[4];
            StringBuilder input = new StringBuilder(br.readLine());
            char[] temp = input.toString().toCharArray();

            for (int j = 0; j < temp.length; j++) {

                if ((int)temp[j] >= 97 && (int)temp[j] <= 122) check[0] = true;
                if ((int)temp[j] >= 65 && (int)temp[j] <= 90) check[1] = true;
                if ((int)temp[j] >= 48 && (int)temp[j] <= 57) check[2] = true;
                if ((int)temp[j] == 35 || (int)temp[j] == 38 || (int)temp[j] == 42 || (int)temp[j] == 64) check[3] = true;
            }

            if (!check[0]) input.append('a');
            if (!check[1]) input.append('A');
            if (!check[2]) input.append('1');
            if (!check[3]) input.append('#');

            while (input.length() < 8) input.append('a');

            sb.append("Case #").append(i).append(": ").append(input).append("\n");
        }

        System.out.println(sb);

    }
}
