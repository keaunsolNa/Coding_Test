import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int total = arr[0] + 1;
        for (int i = 1; i < n; i++) {

            if (total >= arr[i])
            {
                total++;
            }
            else {
                total = arr[i] + 1;
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}