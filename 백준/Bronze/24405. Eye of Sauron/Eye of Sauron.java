import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = br.readLine();
		
		boolean turn = false;
		int chk = 0;
		for(int i = 0; i < input.length(); i++) {
			
			
			if(input.charAt(i) == '(') {
				turn = true;
				continue;
			} 
			if(input.charAt(i) == ')') continue;
			
			if(!turn) chk++;
			else chk--;
			
		}
		
		if(chk == 0) System.out.println("correct");
		else System.out.println("fix");
		
	}
}
