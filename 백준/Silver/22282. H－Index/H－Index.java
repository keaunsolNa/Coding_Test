import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] citations = new int[n];

        for(int i = 0; i < n; i++) citations[i] = Integer.parseInt(br.readLine());

        Arrays.sort(citations);
        int max = 0;

        for(int i = n- 1; i > - 1; i--) {

            int min = Math.min(citations[i], n - i);
            max = Math.max(max, min);
        }

        System.out.println(max);
    }
}