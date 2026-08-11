import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int y = 2014;
	   int m = 4;
	   int d = 2;

	   int n = Integer.parseInt(br.readLine()) - 1;
       
       while (n-- > 0) {
    	   
           d += 1;
           
           if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
        	   
               if (d == 32) {
                   m += 1;
                   d = 1;
               }
               
           } else if (m == 4 || m == 6 || m == 9 || m == 11) {
        	   
               if (d == 31) {
                   m += 1;
                   d = 1;
               }
               
           } else if (m == 12) {
        	   
               if (d == 32) {
                   y += 1;
                   m = 1;
                   d = 1;
               }
               
           } else if (m == 2) {
        	   
               boolean leaf = false;
               
               if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)  leaf = true;
               
               if (d == 29 && !leaf) {
            	   
                   m += 1;
                   d = 1;
                   
               }
               
               if (d == 30 && leaf) {
            	   
                   m += 1;
                   d = 1;
                   
               }
               
           }
           
       }
       
       if (m < 10 && d < 10) System.out.printf("%d-0%d-0%d\n", y, m, d);
       
       if (m < 10 && d >= 10)  System.out.printf("%d-0%d-%d\n", y, m, d);
       
       if (m >= 10 && d < 10) System.out.printf("%d-%d-0%d\n", y, m, d);
       
       if (m >= 10 && d >= 10) System.out.printf("%d-%d-%d\n", y, m, d);
       
   }
}
