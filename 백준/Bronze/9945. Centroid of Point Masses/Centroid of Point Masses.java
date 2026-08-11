import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int idx = 1;
	   while(true) {
		   
		   int n = Integer.parseInt(br.readLine());
		   
		   if(n < 0) break;
		   
		   double X = 0;
		   double Y = 0;
		   double Z = 0;
		   
		   for(int i = 0; i < n; i++) {
			   st = new StringTokenizer(br.readLine());
			   
			   double x = Integer.parseInt(st.nextToken());
			   double y = Integer.parseInt(st.nextToken());
			   double z = Integer.parseInt(st.nextToken());
			   
			   X += x * z; 
			   Y += y * z; 
			   Z += z;
		   }
		   
		   
		   String XA = String.format("%.2f", X/Z);
		   String XB = String.format("%.2f", Y/Z);
		   sb.append("Case " + idx + ": " + XA + " " + XB);
		   sb.append("\n");
		   idx++;
		   
		   br.readLine();
	   }
	   
	   System.out.print(sb);
   }
}
