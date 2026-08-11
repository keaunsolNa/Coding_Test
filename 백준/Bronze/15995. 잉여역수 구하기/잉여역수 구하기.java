import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double a = Integer.parseInt(st.nextToken());
	   double m = Integer.parseInt(st.nextToken());

	   for(double i = 1; ; i++) {
		   
		   if((a * i) % m == 1) {
			   System.out.println((int)i);
			   return;
		   }
		   i++;
	   }
   }
}
