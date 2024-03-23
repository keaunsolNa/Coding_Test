import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {

            long number = Long.parseLong(br.readLine());
            sb.append("Case #").append(i).append(": ");
            for (long j = number; j >= 0; j--)
                if(isTidy(j)) { sb.append(j); break; }

            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static boolean isTidy(long number) {

        char[] arr = String.valueOf(number).toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) return false;
        }

        return true;
    }

}