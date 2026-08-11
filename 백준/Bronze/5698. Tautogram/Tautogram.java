import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = "";
		
		while(!(input = br.readLine()).equals("*")) {
			
			String[] temp = input.toUpperCase().split(" ");
			
			char target = temp[0].charAt(0);
			String answer = "Y";
			for (String string : temp) 
				if(string.charAt(0) != target) {
					answer = "N";
					break;
				}
			
			System.out.println(answer);
		}
	}
}
