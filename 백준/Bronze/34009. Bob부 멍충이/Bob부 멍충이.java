import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        long alice = 0, bob = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {

            int remain = n - i;
            if (remain % 2 == 0) alice += arr[i];
            else bob += arr[i];

            if (bob >= alice) {
                flag = false;
                break;
            };
        }

        bw.write(flag ? "Alice" : "Bob");
        bw.flush();
        bw.close();
        br.close();
    }



}