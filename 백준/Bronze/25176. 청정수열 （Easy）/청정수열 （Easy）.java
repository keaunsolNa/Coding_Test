import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));
    }

    public static long factorial(long N) {
        long fac = 1;

        while(N > 1) {
            fac = fac * N;
            N--;
        }

        return fac;
    }
}
