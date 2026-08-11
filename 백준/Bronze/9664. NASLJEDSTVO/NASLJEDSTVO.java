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
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   int O = Integer.parseInt(br.readLine());
	   
	   int d = O / (N - 1);
	   int min = O + d;
	   
	   if(O - d * (N - 1) == 0) System.out.println(min - 1 + " " + min);
	   else System.out.println(min + " " + min);
   }
}
