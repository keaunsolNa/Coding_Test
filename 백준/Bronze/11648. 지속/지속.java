import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String N = br.readLine();
	   int cnt = 0;
	   
	   if(N.length() == 1) {
		   System.out.println(0);
	   } else {
		   while(N.length() != 1) {
			   int sum = 1;
			   for(int i = 0; i < N.length(); i++) {
				   sum *= Integer.parseInt(N.charAt(i)+"");
			   }
			   N = sum+"";
			   cnt++;
		   }
		   System.out.println(cnt);
	   }
	   
	   
	   
	   
   }
}
