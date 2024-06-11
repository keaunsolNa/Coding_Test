import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        sb.append(1);
        BigInteger multipleValue = new BigInteger(n + "");
        BigInteger big = new BigInteger("1");
        while (sb.length() < x) {

            big = big.multiply(multipleValue);
            sb.append(big);
        }

        System.out.println(sb.charAt(x - 1));
    }


}