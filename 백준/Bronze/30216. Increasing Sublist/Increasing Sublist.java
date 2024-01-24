import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int max = 0;
        int inc = 0;
        for(int i = 1; i < n; i++) {

            if(arr[i] > arr[i - 1]) inc++;
            else inc = 0;

            max = Math.max(inc, max);
        }

        System.out.println(max + 1);
    }

}