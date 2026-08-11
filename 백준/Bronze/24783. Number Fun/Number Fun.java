import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());
		   double A = Integer.parseInt(st.nextToken());
		   double B = Integer.parseInt(st.nextToken());
		   double C = Integer.parseInt(st.nextToken());
		   
		   boolean can = false;
		   
		   if(A + B == C) can = true;
		   if(A - B == C) can = true;
		   if(A * B == C) can = true;
		   if(A / B == C) can = true;
		   if(B + A == C) can = true;
		   if(B - A == C) can = true;
		   if(B * A == C) can = true;
		   if(B / A == C) can = true;
		   
		   if(can) sb.append("Possible");
		   else sb.append("Impossible");
		   
		   sb.append("\n");
		   
	   }
	   
	   System.out.println(sb);
	   
   }
}
