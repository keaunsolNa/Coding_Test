import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        System.out.println(Compute(n, m));
    }

    private static long Compute(long n, long m) {
        if (n >= m) return 0;

        long result = 1;

        for (long d = 2; d <= n && result != 0; ++d)
            result = (result * d) % m;

        return result;
    }
}

