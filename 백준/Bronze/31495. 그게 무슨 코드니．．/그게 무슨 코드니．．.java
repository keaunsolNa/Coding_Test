import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if(countChar(input, '"') != 2) System.out.println("CE");
        else if(input.charAt(0) != '"' || input.charAt(input.length() - 1) != '"') System.out.println("CE");
        else {
            input = input.replaceAll("\"", "");

            if(input.isEmpty()) System.out.println("CE");
            else System.out.println(input);
        }
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

}