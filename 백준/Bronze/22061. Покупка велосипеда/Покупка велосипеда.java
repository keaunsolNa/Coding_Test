import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
		   st = new StringTokenizer(br.readLine());
		   
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
		   boolean chk = false;
		   
		   if(c - a <= 0) chk = true;
		   
		   if(a != 0) 
			   if(c - (2 * b) - a <= 0) chk = true;
		   
		   if(chk) sb.append("YES");
		   else sb.append("NO");
		   
		   sb.append("\n");
		   
	   }
	   
	   System.out.println(sb);
   }
}
