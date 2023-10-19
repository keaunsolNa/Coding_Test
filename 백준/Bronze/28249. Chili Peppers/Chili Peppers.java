import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   long total = 0;
	   for(int i = 0; i < N; i++) {
		   
		   String input = br.readLine();
		   total += input.equals("Poblano") ? 1500 : input.equals("Mirasol") ? 6000 : input.equals("Serrano") ? 15500 : input.equals("Cayenne") ? 40000 : input.equals("Thai") ? 75000 : 125000;
	   }

	   System.out.println(total);
   }
}