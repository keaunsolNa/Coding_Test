import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String name = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int len = name.length();

        for (int i = 1; i <= n; i++) {

            String temp = br.readLine();
            if (temp.length() != len) continue;

            long cnt = IntStream.range(0, name.length())
                    .filter(c -> name.charAt(c) != temp.charAt(c))
                    .count();

            if (cnt <= 1) {
                System.out.println(i);
                break;
            }
        }





    }

}
