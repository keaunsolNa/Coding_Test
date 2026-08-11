import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while((input = br.readLine()) != null) {
		   
		   int n = Integer.parseInt(input);
		   int k = 0;
		   long s = 0;
		   int rest = 10;
		   boolean[] check = new boolean[10];
		   
		   while(rest > 0) {
			   
			   k++;
			   s += n;
			   
			   long q = s;
			   while(q > 0) {
				   int r = (int)(q % 10);
				   q /= 10;
				   
				   if(!check[r]) {
					   check[r]	= true;
					   rest--;
					   
					   if(rest == 0) break;
				   }
			   }
		   }
		   System.out.println(k);
	   }
	   
   }
}
