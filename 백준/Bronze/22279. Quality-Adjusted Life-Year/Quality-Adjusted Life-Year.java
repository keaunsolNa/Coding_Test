import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   double ans = 0;
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double A = Double.parseDouble(st.nextToken());
		   double B = Double.parseDouble(st.nextToken());
		   
		   ans += A * B;
		   
	   }
	   
	   System.out.printf("%.3f", ans);
   }
}
