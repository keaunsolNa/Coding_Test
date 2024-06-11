import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        char prevMatter = input[0];
        int total = 0;
        String suffix = "";

        for (int i = 1; i < input.length; i++) {

            char temp = input[i];

            if ((int)temp >= 49 && (int)temp <= 57) {

                suffix += temp;

            } else {

                total += getWeight(prevMatter) * Integer.parseInt(suffix.isEmpty() ? "1" : suffix);
                prevMatter = temp;
                suffix = "";
            }
        }

        if (!suffix.isEmpty()) total += getWeight(prevMatter) * Integer.parseInt(suffix);
        else total += getWeight(prevMatter);

        System.out.println(total);
    }


    private static int getWeight(char c) {

        return switch (c) {
            case 'H' -> 1;
            case 'C' -> 12;
            case 'N' -> 14;
            case 'O' -> 16;
            default -> (int) c - 48;
        };

    }

}