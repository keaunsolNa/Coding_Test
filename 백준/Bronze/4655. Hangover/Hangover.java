import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   while(true) {
		   
		   double c = Double.parseDouble(br.readLine());
		   
		   int cnt = 1;
		   double length = 0;
		   
		   if(c == 0.00) break;
		   
	        for(int i = 1; ; i++) {
	        	
	            length += 1.0 / (i + 1);
	            if(length >= c) {
	            	cnt = i; 
	            	break;
            	}
	        }
	        
	        sb.append(cnt + " card(s)" + "\n");
	   }
	   
	   System.out.print(sb);
   }
}
