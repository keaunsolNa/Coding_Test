import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        BigDecimal sum = new BigDecimal("0");

        for (int i = 0; i < n; i++) {

            sum = sum.add(new BigDecimal(arr[i]));
            if (i > 0) sum = sum.divide(new BigDecimal("2"), 10, RoundingMode.HALF_UP);
        }

        System.out.println(sum);
    }
}