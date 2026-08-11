import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0){
		   
		   int target = Integer.parseInt(br.readLine());
		   boolean chk = false;
		   
		   for(int r = 2; r <= 64 && !chk; r++) 
			   chk = isPalindrom(target, r);
		   
		   System.out.println(chk ? 1 : 0);
	   }
   }

   private static boolean isPalindrom(int n, int radix) {
	   ArrayList<Integer> convert = new ArrayList<>();
	   
	   while(n != 0) {
		   convert.add(n % radix);
		   n /= radix;
	   }
	   
	   for(int i = 0; i < convert.size()/2; i++) 
		   if(convert.get(i) != convert.get(convert.size() - 1 - i)) return false;
	   return true;
	   
   }
}
