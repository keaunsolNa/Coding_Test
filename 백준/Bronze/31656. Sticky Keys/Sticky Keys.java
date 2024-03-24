import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] input = br.readLine().toCharArray();

        char prev = input[0];
        sb.append(prev);
        for (int i = 1; i < input.length; i++) {

            if(prev != input[i]) sb.append(input[i]);
            prev = input[i];
        }

        System.out.println(sb);
    }



}