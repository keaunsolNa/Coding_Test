import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < n / 2; i++)
        {
            if (arr[i] == arr[n / 2 + i]) cnt += 2;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();

    }

}
