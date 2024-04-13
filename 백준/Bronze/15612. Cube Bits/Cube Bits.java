import java.util.*;
import java.io.*;

public class Main {

    private static StringBuilder sb = new StringBuilder();
    private static int c, i;
    private static int[] p;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n --> 0) {

            long number = Long.parseLong(br.readLine());
            StringBuilder str = new StringBuilder();


            if (number == 0) str.append("0");

            while (number != 0) {
                str.append(number % 3);
                number /= 3;
            }

            sb.append(str.reverse()).append("\n");
        }

        System.out.print(sb);

    }




}