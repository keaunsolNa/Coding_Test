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
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int A = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   
		   int cnt = 0;
           for (int n = (int)Math.cbrt(A); n <= (int)Math.cbrt(B); n++) 
               if (A <= n * n * n && n * n * n <= B) cnt++;
           
           sb.append("Case #" + i + ": " + cnt + "\n");
	   }
	   
	   System.out.println(sb);
   }
}
