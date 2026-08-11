import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();

	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0")) {
		   st = new StringTokenizer(input);
		   
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   
		   int two = Math.max((a - b) / 2 - (a - b) % 2, 0);
		   int three = a - b <= 1 ? 0 : (a - b) % 2;
		   
		   System.out.println(two + " " + three);
	   }
   }
}
