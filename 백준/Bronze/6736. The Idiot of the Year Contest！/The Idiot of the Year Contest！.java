import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            char b = st.nextToken().charAt(0);

            BigInteger big = factorial(a);

            int ans = big.toString().length() - big.toString().replace(String.valueOf(b), "").length();

            System.out.println(ans);
        }


    }

    private static BigInteger factorial(int n) {

        if(n == 0 || n == 1) return BigInteger.ONE;

        BigInteger result = BigInteger.valueOf(n);
        for(int i = n; i>= 2; i--) result = result.multiply(BigInteger.valueOf(i -1));
        return result;
    }




}