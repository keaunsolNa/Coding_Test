import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("-");
		
		int yy = Integer.parseInt(input[0]);
		int mm = Integer.parseInt(input[1]);
		int dd = Integer.parseInt(input[2]);

		if(mm >= 10) System.out.println("TOO LATE");
		else if(mm == 9 && dd > 16) System.out.println("TOO LATE");
		else System.out.println("GOOD");
   }
}