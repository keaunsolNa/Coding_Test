import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			char[] rule = br.readLine().toCharArray();
			List<Character> list = new ArrayList<>();
			
			for (char c : rule) list.add(c);
			
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) != ' ') {
					sb.append(list.get((int)(input.charAt(j) - 'A')));
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
