import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String A = br.readLine();
	   String B = br.readLine();
	   
	   int cnt = 0;
	   for(int i = 0; i < 4; i++) 
		   if(A.charAt(i) != B.charAt(i)) cnt++;
		   
	   if(cnt == 0) System.out.println(1);
	   else System.out.println((int)Math.pow(2, cnt));
	   
   }
}
