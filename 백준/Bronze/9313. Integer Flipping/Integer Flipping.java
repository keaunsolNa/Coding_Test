import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            StringBuilder binary = new StringBuilder(Integer.toBinaryString(n));
            while (binary.length() < 32) binary.insert(0, "0");

            String reverse = binary.reverse().toString();
            System.out.println(Long.parseLong(reverse, 2));

        }
    }

}
