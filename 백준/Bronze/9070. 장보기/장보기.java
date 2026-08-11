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
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   int N = Integer.parseInt(br.readLine());
		   double max = 0;
		   int ans = 0;
		   for(int i = 0; i < N; i++) {
			   st = new StringTokenizer(br.readLine());
			   
			   double W = Integer.parseInt(st.nextToken());
			   double C = Integer.parseInt(st.nextToken());
			   double WC = W / C;
			   
			   if(max < WC) {
				   max = WC;
				   ans = (int)C;
			   } else if (max == WC) ans = Math.min((int)C, ans);
			   
		   }
		   
		   System.out.println(ans);
	   }
	   
   }
}
