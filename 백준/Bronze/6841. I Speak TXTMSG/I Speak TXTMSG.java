import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, String> textMap = new HashMap<>();
		textMap.put("CU", "see you");
		textMap.put(":-)", "I'm happy");
		textMap.put(":-(", "I'm unhappy");
		textMap.put(";-)", "wink");
		textMap.put(":-P", "stick out my tongue");
		textMap.put("(~.~)", "sleepy");
		textMap.put("TA", "totally awesome");
		textMap.put("CCC", "Canadian Computing Competition");
		textMap.put("CUZ", "because");
		textMap.put("TY", "thank-you");
		textMap.put("YW", "you're welcome");
		textMap.put("TTYL", "talk to you later");
		
		String input = "";
		while(true) {
			input = br.readLine();
			if(input.equals("TTYL")) {
				System.out.println(textMap.get(input));
				break;
			} else {
				
				if(textMap.containsKey(input)) {
					System.out.println(textMap.get(input));
				} else {
					System.out.println(input);
				}
			}
		}
		
	}
}
