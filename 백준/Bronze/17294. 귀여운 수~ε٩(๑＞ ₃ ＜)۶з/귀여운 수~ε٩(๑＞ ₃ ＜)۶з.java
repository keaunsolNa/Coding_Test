import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   String K = br.readLine();
	   
	   if(Long.parseLong(K) < 10) {
		   System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		   return;
	   }
	   else {
		   
		   int term = (int)K.charAt(0) - (int)K.charAt(1);
		   for(int i = 1; i < K.length() - 1; i++) {
			   
			   if((int)K.charAt(i) - (int)K.charAt(i + 1) != term) {
				   
				   System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
				   return;
			   }
		   }
	   }
	   
	   System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
   }
}
