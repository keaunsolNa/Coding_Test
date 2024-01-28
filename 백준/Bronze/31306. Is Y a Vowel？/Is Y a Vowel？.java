import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int min = 0;
        int max = 0;
        for(int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') min++;
            else if (temp == 'y') max++;
        }

        System.out.println(min + " " + (min + max));

    }
}