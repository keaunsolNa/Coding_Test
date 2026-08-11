import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   int price = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < N - 1; i++) price += Integer.parseInt(br.readLine());
	   
	   System.out.println(price);
   }
}
