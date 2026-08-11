import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   long A = Long.parseLong(st.nextToken());
	   long B = Long.parseLong(st.nextToken());
	   String C = st.nextToken();
	   
	   int lastC = C.charAt(C.length() - 1) - '0';

	   if((lastC&1) == 0) { 
		   System.out.println(A);
		   return;
	   }
		
		int result = 0;
		int cur = 1;
		
		while(A + B != 0 ) {
			
			if(( A & 1 ) + ( B & 1 ) == 1) result += cur;
			
			A = A>>1;
			B = B>>1;
			cur = cur<<1;

		}
	   
	   System.out.println(result);	   
	   
   }
}
