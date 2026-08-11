import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   st = new StringTokenizer(br.readLine());
	   double total = 0;
	   for(int i = 0; i < N; i++) {
		   int temp = Integer.parseInt(st.nextToken());
		   
		   switch(temp) {
		   
		       case 0 : total += 2; break;
		       case 1 : total += 1; break;
		       case 2 : total += 0.5; break;
		       case 4 : total += 0.25; break;
		       case 8 : total += 0.125; break;
		       case 16 : total += 0.0625; break;
		   }
	   }
	   
	   System.out.println(total);
   }
}
