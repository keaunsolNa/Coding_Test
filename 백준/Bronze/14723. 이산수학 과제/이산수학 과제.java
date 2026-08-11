import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int i = 1;
	   
	   while(i * (i + 1) / 2 < N) i += 1;
	   

	   int b = N - (i - 1) * i / 2;
	   int a = i + 1 - b;
			   
	   System.out.println(a + " " + b);
   }
}
