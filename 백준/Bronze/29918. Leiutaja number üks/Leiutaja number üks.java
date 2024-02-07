import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr = new int[6];
        for(int i = 0; i < 6; i++) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            arr[i] = n + 10 * m;
        }

        int now = arr[0];
        int max = 0;
        for(int i = 1; i < 6; i++)
            max = Math.max(max, arr[i]);


        System.out.println(Math.max(max - now + 1, 0));
    }

}