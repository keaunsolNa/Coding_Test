import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int N = Integer.parseInt(br.readLine());

	   while(N != 1) {
		   if(N % 2 == 1) {
			   System.out.println(0);
			   return;
		   } 
		   N /= 2;
	   }
	   
	   System.out.println(1);
	   
   }
}
