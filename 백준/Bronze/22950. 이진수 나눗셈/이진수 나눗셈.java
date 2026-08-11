import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   String M = br.readLine();
	   M = M.replaceFirst("^0+(?!$)", "");	   
	   int K = Integer.parseInt(br.readLine());
	   
	   if(!M.contains("1")) {
		   System.out.println("YES");
		   System.exit(0);
	   }
	   
	   if(K == 0) {
		   System.out.println("YES");
		   System.exit(0);
	   }
	   
	   int count = 0;
	   for(int i = M.length() - 1; i >= 0; i--) {
		   
		   if(M.charAt(i) == '1') break;
		   if(M.charAt(i) == '0') count++;
	   }
	   
	   if(count >= K) System.out.println("YES");
	   else System.out.println("NO");
	   
   }
}
