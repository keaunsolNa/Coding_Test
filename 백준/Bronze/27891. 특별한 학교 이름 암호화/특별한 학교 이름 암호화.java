import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder input = new StringBuilder(br.readLine());

		while(true) {
			
			String ans = check(input.toString());
			
			if(!ans.equals("F")) {
				System.out.println(ans);
				break;
			}
			
			StringBuilder tempStr = new StringBuilder();
			for(int i = 0; i < input.length(); i++) {

				int temp = (int)input.charAt(i);
				temp = temp + 1 > 122 ? 97 : temp + 1;

				tempStr.append((char)temp);
			}
			
			input = tempStr;
		}
	}

	private static String check(String input) {

		String NLCS = "northlondo";
		String BHA = "branksomeh";
		String KIS = "koreainter";
		String SJA = "stjohnsbur";
		
		if(input.equals(NLCS)) return "NLCS";
		else if(input.equals(BHA)) return "BHA";
		else if(input.equals(KIS)) return "KIS";
		else if(input.equals(SJA)) return "SJA";
		
		return "F";
	}
}
