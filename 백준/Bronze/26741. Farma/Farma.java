import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int X = Integer.parseInt(st.nextToken());
	   int Y = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i <= X; i++) {
		   
		   int j = X - i;
		   if((i * 2) + (j * 4) == Y) {
			   System.out.println(i + " " + j);
			   return;
		   }
	   }
   }
}
