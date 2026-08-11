import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   String binary = br.readLine();
		   
	        int tot = 0;                                         
	        int d = 1;                                          
	 
	        for(int a = binary.length() ; a > 0; a--) {
	 
	            String str = binary.substring(a -1, a);         
	 
	            tot = tot + ( d * Integer.parseInt(str));
	            
	            d = d * 2;
	        }
	 
	        System.out.println(tot);
	   }
       
   }
}
