import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
      
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
      
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());        
        for (int i = 0; i < m; i++) b[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());        
        
        long total = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
        	
        	total += a[i] * b[i];
        }
        
        System.out.print(Math.min(a.length, b.length) + " " + total);
    }

}