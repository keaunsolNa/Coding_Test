import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int[] arr = new int[5];

            while (n --> 0) {

                String input = br.readLine();

                if (input.equals("M") || input.equals("L")) arr[0]++;
                else if (input.equals("S")) arr[3]++;
                else if (input.equals("X")) arr[4]++;
                else if (Integer.parseInt(input) >= 12) arr[1]++;
                else if (Integer.parseInt(input) < 12) arr[2]++;

            }

            for (int i = 0; i < 5; i++) sb.append(arr[i]).append(" ");

            sb.append("\n");
        }

        System.out.println(sb);
    }



}