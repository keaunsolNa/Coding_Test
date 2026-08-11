import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   String input = br.readLine();
		   int A = Integer.parseInt(input.substring(0, 2)) * Integer.parseInt(input.substring(0, 2));
		   int B = Integer.parseInt(input.substring(2, 4)) * Integer.parseInt(input.substring(2, 4));
		   
		   if((A + B) % 7 == 1) System.out.println("YES");
		   else System.out.println("NO");
	   }
   }
}
