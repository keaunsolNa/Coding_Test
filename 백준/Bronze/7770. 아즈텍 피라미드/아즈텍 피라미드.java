import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int A = 1;
		int B = 1;
		int floor = 1;

		while(true) {
			B += 4 * floor;
			A += B;
			if(A > N) break;
			floor++;
		}
		
		System.out.println(floor);
   }
}