import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		Integer[] can = new Integer[] {0, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 
							   72, 78, 84, 90, 96, 102, 108, 114, 120, 126, 
							   132, 138, 144, 150, 156, 162, 168, 174, 180 };
		
		List<Integer> list = Arrays.asList(can);
		
		while((input = br.readLine()) != null) {
			
			int degree = Integer.parseInt(input);
			
			System.out.println(list.contains(degree) ? "Y" : "N");
			
		}
   }
}