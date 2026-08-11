import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
		   double total = 0;
		   
		   long R = Integer.parseInt(st.nextToken());
		   long A = Integer.parseInt(st.nextToken());
		   long B = Integer.parseInt(st.nextToken());
		   
		   while(R != 0) {
			   
			   total += Math.PI * (R * R);
			   total += Math.PI * ((R * A) * (R * A));
			   
			   R = (R * A) / B;
		   }
		   String ans = String.format("%.6f", total);
		   
		   sb.append("Case #" + i + ": " + ans + "\n");
	   }
	   
	   System.out.println(sb);
   }
}
