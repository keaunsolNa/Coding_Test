import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   List<Long> list = new ArrayList<>();
		   long maxGCD = 0;
		   
		   while(st.hasMoreTokens()) list.add(Long.parseLong(st.nextToken()));
		   
		   for(int i = 0; i < list.size(); i++) {
			   
			   for(int j = 0; j < list.size(); j++) {
				   
				   if(i == j) continue;
				   maxGCD = Math.max(maxGCD, gcd(list.get(i), list.get(j)));
			   }
		   }
		   
		   System.out.println(maxGCD);
	   }
	   
   }

   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }
}
