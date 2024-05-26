import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());

       long temp = 0;
       st = new StringTokenizer(br.readLine());
       for (int i = 0; i < n; i++) temp += Integer.parseInt(st.nextToken());

       st = new StringTokenizer(br.readLine());
       int[] arr = new int[m];
       for (int i = 0; i < m; i++) arr[i] = Integer.parseInt(st.nextToken());
       Arrays.sort(arr);

       for (int i = 0; i < m; i++) {

           if (arr[i] == 0) continue;

           temp *= arr[i];
       }

        System.out.println(temp);

    }
}
