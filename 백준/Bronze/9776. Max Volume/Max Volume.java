import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   double ans = 0;
	   while(T -- > 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   char V = st.nextToken().charAt(0);
		   
		   double pie = 3.14159;
		   
		   
		   switch(V) {
		   
		   		case 'S' : 
		   			
		   			double r = Double.parseDouble(st.nextToken());
		   			ans = Math.max(ans, (pie * Math.pow(r, 3)) / 3 * 4);
		   			break;
		   			
		   		case 'C' :
		   			
		   			double r2 = Double.parseDouble(st.nextToken());
		   			double h = Double.parseDouble(st.nextToken());
		   			ans = Math.max(ans, (pie * Math.pow(r2, 2) * h) / 3);
		   			break;
		   			
		   		case 'L' : 
		   			
		   			double r3 = Double.parseDouble(st.nextToken());
		   			double h2 = Double.parseDouble(st.nextToken());
		   			ans = Math.max(ans, pie * Math.pow(r3, 2) * h2);
		   }
	   }
	   
	   System.out.printf("%.3f", ans);
   }
}
