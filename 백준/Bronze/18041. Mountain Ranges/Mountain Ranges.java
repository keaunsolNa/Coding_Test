import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       int x = Integer.parseInt(st.nextToken());
       
       int[] arr = new int[n];
       st = new StringTokenizer(br.readLine());
       for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
       int max = 1;
       
       for (int i = 0; i < n - 1; i++) {

    	   int cnt = 1;
    	   int temp = i;
    	   for (int j = i + 1; j < n; j++) {
    		   
    		   if (arr[j] - arr[temp++] <= x) cnt++;
    		   else break;
    	   }
    	   max = Math.max(max, cnt);
       }
       
       System.out.println(max);
    }

}