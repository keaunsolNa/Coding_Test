import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[] arr = new int[n * 2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        boolean flag = true;
        for (int i = 0; i < 2 * n; i += 2) {

            if(arr[i + 1] - arr[i] > d) { flag = false; break;}
        }

        System.out.println(flag ? "Yes" : "No");
    }


}