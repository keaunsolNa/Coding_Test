import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());
        BigInteger idx = new BigInteger("1");
        while (sb.length() < k) {

            sb.append(idx.multiply(idx).multiply(idx));
            idx = idx.add(new BigInteger("1"));
        }

        System.out.println(sb.charAt(k - 1));
    }


}