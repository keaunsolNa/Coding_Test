import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		double happy = 0;
		double sad = 0;
		
		happy += countChar(input, 'H');
		happy += countChar(input, 'A');
		happy += countChar(input, 'P');
		happy += countChar(input, 'Y');

		sad += countChar(input, 'S');
		sad += countChar(input, 'A');
		sad += countChar(input, 'D');
		

		if(happy == 0 && sad == 0) System.out.println("50.00");
		else System.out.printf("%.2f", (double)happy / (sad + happy) * 100 );
   }
    
    public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
}