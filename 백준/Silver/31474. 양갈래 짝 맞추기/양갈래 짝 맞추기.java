import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long ans = 1;

        while(n != 0) {

            ans *= n - 1;
            n -= 2;
        }

        System.out.println(ans);
    }
}
