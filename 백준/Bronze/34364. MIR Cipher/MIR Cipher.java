import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        char[] arr = st.nextToken().toCharArray();

        int[] multiple = new int[n];
        multiple[0] = 1;
        for (int i = 1; i < n; i++) {
            multiple[i] = multiple[i - 1] * 2 % 26;
        }

        for (int i = 0; i < n; i++)
        {
            int temp = arr[i] - 'A';
            temp = (temp + multiple[i]) % 26;
            bw.write((char)('A' + temp));
        }

        bw.flush();
        bw.close();
    }
}