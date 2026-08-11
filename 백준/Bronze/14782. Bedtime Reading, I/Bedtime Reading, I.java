import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int I = Integer.parseInt(br.readLine());
	   
	   long sum = 0;
	   for(int i = 1; i <= I; i++) 
		   if(I % i == 0) sum += i;
	   
	   System.out.println(sum);
   }
}
