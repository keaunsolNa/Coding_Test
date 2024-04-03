import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        long ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            ans ^= (arr[i] * arr[i]);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) ans ^= (arr[i] * arr[i + 1]);

        System.out.println(ans);

    }

}
