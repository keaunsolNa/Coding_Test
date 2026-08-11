import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int w1 = Integer.parseInt(br.readLine());
	   int h1 = Integer.parseInt(br.readLine());
	   int w2 = Integer.parseInt(br.readLine());
	   int h2 = Integer.parseInt(br.readLine());
	   
	   int w = Math.max(w1, w2)*2;
	   int h = (h1+h2)*2;
	   System.out.println(4+w+h);
	   
   }
}
