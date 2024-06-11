import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int len = input.length();

        String first = input.substring(0, len / 3);
        String second = input.substring(len / 3, len / 3 * 2);
        String third = input.substring(len / 3 * 2, len);

        System.out.println(first.equals(second) ? first : first.equals(third) ? first : second);

    }


}