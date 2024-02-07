import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<BigInteger> tc = new ArrayList<>();

        for (int i = 0; i < T; i++) tc.add(new BigInteger(br.readLine()));

        List<Integer> answer = new ArrayList<>();

        for (BigInteger t : tc) {

            int left = getLeft(t);
            answer.add(left);

        }

        for (int ans : answer) System.out.println(ans);

    }

    private static int getLeft(BigInteger t) {

        BigInteger exp = t.multiply(t.add(BigInteger.ONE));
        int left = 1;
        int right = 1000000000;
        int level;

        while (left <= right) {

            level = (left + right) / 2;

            if (new BigInteger(String.valueOf(level))
                    .multiply(new BigInteger(String.valueOf(level + 1)))
                    .multiply(BigInteger.valueOf(2)).compareTo(exp) > 0)
                right = level - 1;

            else left = level + 1;

        }
        return left;
    }
}