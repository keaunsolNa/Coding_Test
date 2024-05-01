import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        char[] input = br.readLine().toCharArray();
        int hab = 0;
        int n = input.length;

        for (char c : input) {

            hab += c;
        }

        System.out.println((char)(hab / n));

    }
}
