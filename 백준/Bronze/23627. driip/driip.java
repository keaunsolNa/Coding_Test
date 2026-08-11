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
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.length() < 5) {
			System.out.println("not cute");
		} else {
			boolean flag = false;
			if(input.charAt(input.length()-1) == 'p') 
				if(input.charAt(input.length()-2) == 'i')
					if(input.charAt(input.length()-3) == 'i')
						if(input.charAt(input.length()-4) == 'r')
							if(input.charAt(input.length()-5) == 'd') flag = true;
			
			if(flag) System.out.println("cute");
			else System.out.println("not cute");
		}
	}
}
