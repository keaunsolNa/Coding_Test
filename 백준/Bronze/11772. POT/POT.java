import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   long sum = 0;
	   for(int i = 0; i < N; i++) {
		   
		   int temp = Integer.parseInt(br.readLine());
		   
		   sum += Math.pow(temp / 10, temp % 10);
	   }
	   
	   System.out.println(sum);
   }
}
