import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) ans = Math.min(ans, arr[i] + arr[n - i - 1]);

        System.out.println(ans);

    }
}
