import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[t];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            if (i < t) sorted[i] = temp;
        }

        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            if (i < t) bw.write(sorted[i] + " ");
            else bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}