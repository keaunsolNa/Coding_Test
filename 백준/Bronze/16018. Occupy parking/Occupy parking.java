import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int space = Integer.parseInt(br.readLine());
		
		int emptySpace = 0;
		String before = br.readLine();
		String now = br.readLine();
		
		for(int i = 0; i < space; i++) {
			
			if(before.charAt(i) == 'C') {
				
				if(now.charAt(i) == 'C') {
					emptySpace++;
				}
			}
		}
		
		System.out.println(emptySpace);
				
	}
}
