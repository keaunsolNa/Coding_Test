import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] input = br.readLine().toCharArray();

        int t = 0, d = 0, l = 0, f = 0;
        for (char c : input) {

            switch (c) {
                case 'T' : t++; break;
                case 'D' : d++; break;
                case 'L' : l++; break;
                case 'F' : f++; break;
            }

        }

        System.out.println(1L << (t + d + l + f));


    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

}