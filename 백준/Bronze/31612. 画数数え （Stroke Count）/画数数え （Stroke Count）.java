import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] temp = br.readLine().toCharArray();

        int ans = 0;
        for (int i = 0; i < n; i++) {

            ans += temp[i] == 'o' ? 1 : 2;
        }

        System.out.println(ans);
    }
}
