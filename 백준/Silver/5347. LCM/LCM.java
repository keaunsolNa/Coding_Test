import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       StringTokenizer st;
       int T = Integer.parseInt(br.readLine());
       
       while(T --> 0) {
    	   st = new StringTokenizer(br.readLine(), " ");
    	   long num1 = Long.parseLong(st.nextToken());
    	   long num2 = Long.parseLong(st.nextToken());
    	   long gcd = gcd(num1, num2);
    	   System.out.println(num1 * num2 / gcd);
       }
    		   
   }

   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }
}
