import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            long n = Integer.parseInt(br.readLine());

            String ans = factorial(n) + "";

            System.out.println(ans.charAt(ans.length() - 1));

        }
    }
    private static long factorial(long N) {

        long result = 1;

        for (long i = 1; i <= N; i++) {

            result = result * i;
        }

        return result;

    }


}
