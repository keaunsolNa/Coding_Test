import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;

        while(i < n) {

            if(arr[i] - arr[j] < m) { i++; continue; }

            if(arr[i] - arr[j] == m) { min = m; break; }

            min = Math.min(min, arr[i] - arr[j]);
            j++;
        }

        System.out.println(min);


    }
}