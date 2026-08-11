import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   long n = Long.parseLong(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   
		   List<Character> list = new ArrayList<>();
		   
		   while (n > 0) {
			   
			   if (n % b < 10) list.add((char) (n % b + '0'));
			   else list.add((char) (n % b - 10 + 'A'));
			   n /= b;
			   
		   }
		   
		   StringBuilder sb = new StringBuilder();
		   for (int i = list.size() - 1; i >= 0; i--) sb.append(list.get(i));
		   
		   System.out.println(isPalindrome(sb.toString()) ? "1" : "0");
	   }
 
   }

   private static boolean isPalindrome(String word) {
       for (int i = 0; i < (word.length() / 2); i++) {
           if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
               return false;
           }
       }
       return true;
   }
}
