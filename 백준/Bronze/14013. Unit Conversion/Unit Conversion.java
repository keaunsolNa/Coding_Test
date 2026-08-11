import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double x = Double.parseDouble(st.nextToken());
	   double y = Double.parseDouble(st.nextToken());
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double A = Double.parseDouble(st.nextToken());
		   char key = st.nextToken().charAt(0);
		   
		   if(key == 'A') sb.append(A / x * y);
		   else sb.append(A / y * x);
			   
		   sb.append("\n");
	   }
	   
	   System.out.println(sb);
   }
}
