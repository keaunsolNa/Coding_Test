import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1 || n == 2) 
        {
            System.out.println(1);
            return;
        }

        BigInteger[] fib = new BigInteger[n + 1];
        fib[1] = BigInteger.ONE;
        fib[2] = BigInteger.ONE;

        for (int i = 3; i <= n; i++) 
        {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }

        System.out.println(fib[n]);
    }

}
