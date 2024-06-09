import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 100; i >= 0; i--) {
            if (n - i * 7 * 52 > 0 && (n - i * 7 * 52) % (21 * 52) == 0) {
                System.out.println(i);
                System.out.println((n - i * 7 * 52) / (21 * 52));
                break;
            }
        }

    }
}