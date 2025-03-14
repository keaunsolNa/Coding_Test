import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int max = 1;

        for (int i = 0; i < n; i++) {

            int temp = 1;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] - arr[i] > k) break;
                temp++;
            }

            max = Math.max(max, temp);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        br.close();
        bw.close();
    }

}