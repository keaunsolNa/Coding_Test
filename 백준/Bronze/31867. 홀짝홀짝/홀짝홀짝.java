import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        int one = 0;
        int two = 0;
        for (char c : input) {

            if (Character.getNumericValue(c) % 2 == 0) one++;
            else two++;
        }

        System.out.println(one > two ? "0" : one < two ? "1" : "-1");
    }

}
