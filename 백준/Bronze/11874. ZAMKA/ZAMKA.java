import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   int L = Integer.parseInt(br.readLine());
	   int D = Integer.parseInt(br.readLine());
	   int X = Integer.parseInt(br.readLine());
	   
	   int min = Integer.MAX_VALUE;
	   int max = Integer.MIN_VALUE;
	   
	   for(int i = L; i <= D; i++) {
		   
		   int x = 0;
		   
		   for(int j = 0; j < (i+"").length(); j++) {
			   
			   x += Character.getNumericValue((i+"").charAt(j));
		   }
		   
		   if(x == X) {
			   
			   min = Math.min(min, i);
			   max = Math.max(max, i);
			   
		   }
	   }
	   
	   System.out.println(min);
	   System.out.println(max);
   }
}
