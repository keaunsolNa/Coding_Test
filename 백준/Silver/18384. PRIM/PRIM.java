import java.io.*;
import java.util.*;

public class Main {

    private static final long MAX = 100000000;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][5];
        int max = 0;
        for (int i = 0; i < t; i++)
        {
            st = new StringTokenizer(br.readLine());
            int[] temp = new int[5];
            for (int j = 0; j < 5; j++)
            {
                temp[j] = Integer.parseInt(st.nextToken());
                max = Math.max(temp[j], max);
            }

            arr[i] = temp;
        }

        for (int i = max; ; i++)
        {
            if (isPrime(i))
            {
                max = i;
                break;
            }
        }

        boolean[] isPrime = new boolean[max + 1];
        for (int i = 0; i < max; i++)
        {
            if (isPrime(i)) isPrime[i] = true;
        }

        isPrime[max] = true;

        for (int[] ar : arr)
        {
            long sum = 0;
            for (int a : ar) {

                for (int i = a; ; i++) {
                    if (isPrime[i]) {
                        sum += i;
                        break;
                    }
                }
            }

            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(long n) {

        if (n == 1 || n == 0) return false;

        for (long i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }

        return true;

    }
}