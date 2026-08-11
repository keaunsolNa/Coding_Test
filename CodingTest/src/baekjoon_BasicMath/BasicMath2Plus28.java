package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus28 {

   public static void main(String[] args) throws IOException {
      test06();
   }
   
   
   // Vending Machine
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] button = br.readLine().split(" ");
       
       int ans = 5000;
       for(int i = 0; i < button.length; i++) {
    	   
    	   switch(button[i]) {
    	   
    	   		case "1" : ans -= 500; break;
    	   		case "2" : ans -= 800; break;
    	   		case "3" : ans -= 1000; break;
    	   	
    	   }
       }
       System.out.println(ans);
   }
   
   
   // ABCD-код
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   String input = br.readLine();
		   int A = Integer.parseInt(input.substring(0, 2)) * Integer.parseInt(input.substring(0, 2));
		   int B = Integer.parseInt(input.substring(2, 4)) * Integer.parseInt(input.substring(2, 4));
		   
		   if((A + B) % 7 == 1) System.out.println("YES");
		   else System.out.println("NO");
	   }
   }
   
}