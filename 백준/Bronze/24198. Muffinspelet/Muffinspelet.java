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
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   int A = 0;
	   int B = 0;
	   
	   while(N != 0) {
		   A += (N /2) + (N % 2);
		   N /= 2;
		   if(N == 0) break;
		   B += (N / 2) + (N % 2);
		   N /= 2;
	   }
	   
	   System.out.println(B + " " + A);
   }
}
