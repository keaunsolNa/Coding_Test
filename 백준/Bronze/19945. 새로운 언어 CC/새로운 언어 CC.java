import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
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
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   if(N == 0) System.out.println(1);
	   else if(N < 0) System.out.println(32);
	   else {
		   
		   int ans = 0;
		   while(N > 0){
			   ans++;
			   N /= 2;
		   }
		   
		   System.out.println(ans);
	   }
   }
}
