import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input =  br.readLine();
		
		if(input.contains("7")) System.out.println(Integer.parseInt(input) % 7 == 0 ? 3 : 2);
		else System.out.println(Integer.parseInt(input) % 7 == 0 ? 1 : 0);
   }
}