import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long s = 0;
        long t = 0;
        for (int i = 0; i < n; i++) {

            String temp = br.readLine().toLowerCase();

            s += countChar(temp, 's');
            t += countChar(temp, 't');
        }

        System.out.println(s < t ? "English" : "French");


    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

}
