import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int x = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   
	   if(k*7 <= x) {
		   System.out.println(k*7000);
	   } else if(k*3.5 <= x) {
		   System.out.println(k*3500);
	   } else if(k*1.75 <= x) {
		   System.out.println(k*1750);
	   } else {
		   System.out.println(0);
	   }
   }
}
