import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        BigInteger big = new BigInteger(n+"");
        BigInteger multiple = new BigInteger(n + "");
        while(p --> 1) {
            big = big.multiply(multiple);
        }

        String str = big.toString();
        for(int i = 0; i < str.length(); i += 70) {

            sb.append(str, i, Math.min(i + 70, str.length())).append("\n");
        }

        System.out.println(sb);
    }



}