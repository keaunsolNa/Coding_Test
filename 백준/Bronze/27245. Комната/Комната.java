import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int w = Integer.parseInt(br.readLine());
	   int l = Integer.parseInt(br.readLine());
	   int h = Integer.parseInt(br.readLine());
	   
	   if(w > l) {
		   
		   if(w / l > 2) {
			   System.out.println("bad");
			   return;
		   }
		   
		   if(l / h < 2) {
			   System.out.println("bad");
			   return;
		   }
		   
	   } else {
		   
		   if(l / w > 2) {
			   System.out.println("bad");
			   return;
		   }
		   
		   if(w / h < 2) {
			   System.out.println("bad");
			   return;
		   }
	   }
	   
	   System.out.println("good");
	   
   }
}
