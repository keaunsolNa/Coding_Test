import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   long N = Long.parseLong(br.readLine());
	   
	   int point = 0;
	   while(N != 1) {
		   
		   if(N % 2 != 0) N = N * 3 + 1;
		   else N /= 2;
		   point++;
	   }
	   
	   System.out.println(point);
   }
}
