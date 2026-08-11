import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int target = 10;
	   
	   while(T > target) {

		   int mod = T % target;
		   if (mod * 10 / target >= 5) T += target;
		   T -= mod;
		   target *= 10;
		   
	   }
	
	   System.out.println(T);
   }
}
