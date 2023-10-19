import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
	   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = br.readLine();
	   
	   int total = input.length();
	   
	   for(int i = 0; i < input.length(); i++) {
		   
		   if(isPal(input.substring(i))) break;
		   total++;
	   }
	   
	   System.out.println(total);
	}

	private static boolean isPal(String s) {
		
		int start = 0;
		int last = s.length() - 1;
		
		while(start <= last) {
			
			if(s.charAt(start) != s.charAt(last)) return false;
			
			start++;
			last--;
		}
		
		return true;
	}
}