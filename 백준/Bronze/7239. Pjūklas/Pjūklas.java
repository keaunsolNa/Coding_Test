import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int isOddOrEven = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] big = new int[n / 2];
        int[] small = new int[isOddOrEven];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        System.arraycopy(arr, 0, small, 0, small.length);
        System.arraycopy(arr, small.length, big, 0, big.length);

        for (int i = 0; i < (isOddOrEven); i++) {
            sb.append(small[i]).append(" ");
            if (i < n / 2) sb.append(big[i]).append(" ");
        }

        System.out.print(sb.deleteCharAt(sb.length() - 1));


    }

}