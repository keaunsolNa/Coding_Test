import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       StringBuilder sb = new StringBuilder();
       int t = Integer.parseInt(st.nextToken());
       
       for (int k = 1; k <= t; k++) {
    	   
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           int c = Integer.parseInt(st.nextToken());

           int res = 0;
           int tmp = 0;
           
           for (int i = 0; i < a; i++) {
        	   
               res += (b + tmp) / c;
               if ((b + tmp) % c != 0) {
            	   
                   res++;
                   tmp = (b + tmp) % c;
                   
               } else tmp = 0;
           }
           
           sb.append("Case #" + k + ": " + res).append("\n");
       }

       System.out.println(sb);
   }
}
