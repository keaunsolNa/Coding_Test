import java.io.*;
import java.util.*;

public class Main {

    private static int n;
    private static String[] star;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        star = new String[n];
        star[0] = "  *  ";
        star[1] = " * * ";
        star[2] = "*****";

        for (int i = 1; 3 * Math.pow(2, i) <= n; i++)
            solve(i);

        for (int i = 0; i < n; i++) {
            sb.append(star[i]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    private static void solve (int i) {

        int bottom = (int) (3 * Math.pow(2, i));
        int middle = bottom / 2;

        for (int j = middle; j < bottom; j++)
            star[j] = star[j - middle] + " " + star[j - middle];

        String blank = " ".repeat(middle);

        for (int j = 0; j < middle; j++) {
            star[j] = blank + star[j] + blank;
        }
    }

}