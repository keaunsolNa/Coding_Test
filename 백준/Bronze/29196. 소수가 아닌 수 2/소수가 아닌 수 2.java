import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double k = Double.parseDouble(br.readLine());
        double epsilon = 1e-6;
        int p = 1;
        int q = 1;

        while (Math.abs(p / (double) q - k) > epsilon) {

            if (p / (double) q > k) q++;
           else p++;

        }

        System.out.println("YES");
        System.out.println(p + " " + q);
    }

}
