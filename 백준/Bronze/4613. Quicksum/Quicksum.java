import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input ="";
		while(!(input = br.readLine()).equals("#")) {
			long total = 0;
			for(int i = 0; i < input.length(); i++) {
				char strChar = input.charAt(i);
				
				for(int j = 1; j < 27; j++) {
					if((int)(strChar - 'A') + 1 == j) {
						total += (i+1) * j;
					}
				}
			}
			System.out.println(total);
		}
	}
}
