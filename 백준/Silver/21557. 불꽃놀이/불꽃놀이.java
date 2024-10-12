import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int idx = n - 2;
        while(idx > 0)
        {
            if (idx == 1)
            {
                arr[0]--;
                arr[n - 1]--;
            }
            else
            {
                if (arr[0] >= arr[n - 1]) arr[0]--;
                else arr[n - 1]--;
            }
            idx--;
        }
        
        bw.write(arr[0] >= arr[n - 1] ? String.valueOf(arr[0]) : String.valueOf(arr[n - 1]));
        bw.flush();
        bw.close();
        br.close();

    }


}
