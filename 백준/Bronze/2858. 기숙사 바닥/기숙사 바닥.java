import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int R = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   for(int i = 3; ; i++) {
		   for(int j = 3; j <= i; j++) {
			   
			   if(i * 2 + ((j - 2) * 2) == R && i * j - R == B) {
				   
				   System.out.println(Math.max(i, j) + " " + Math.min(i, j));
				   return;
			   }
		   }
	   }
   }
}
