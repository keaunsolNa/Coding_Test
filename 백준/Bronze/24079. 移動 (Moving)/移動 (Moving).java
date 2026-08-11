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
	   int X = Integer.parseInt(br.readLine());
	   int Y = Integer.parseInt(br.readLine());
	   int Z = Integer.parseInt(br.readLine());
	   
	   if(X+Y > Z) {
		   System.out.println(0);
	   } else {
		   System.out.println(1);
	   }
   }
}
