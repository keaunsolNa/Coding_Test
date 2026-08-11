import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] hamburger = new int[3];
		int[] drink = new int[2]; 
		hamburger[0] = Integer.parseInt(br.readLine()); 
		hamburger[1] = Integer.parseInt(br.readLine()); 
		hamburger[2] = Integer.parseInt(br.readLine()); 
		drink[0] = Integer.parseInt(br.readLine()); 
		drink[1] = Integer.parseInt(br.readLine()); 
		
		Arrays.sort(hamburger);
		Arrays.sort(drink);
		
		System.out.println(hamburger[0] + drink[0] - 50);
	}
}
