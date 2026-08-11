import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder ans = new StringBuilder();
		while(N --> 0) {
			String input = br.readLine();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < input.length(); i++) {
				switch(input.toUpperCase().charAt(i)) {
				
					case 'A' : sb.append(2); break;
					case 'B' : sb.append(2); break;
					case 'C' : sb.append(2); break;
					case 'D' : sb.append(3); break;
					case 'E' : sb.append(3); break;
					case 'F' : sb.append(3); break;
					case 'G' : sb.append(4); break;
					case 'H' : sb.append(4); break;
					case 'I' : sb.append(4); break;
					case 'J' : sb.append(5); break;
					case 'K' : sb.append(5); break;
					case 'L' : sb.append(5); break;
					case 'M' : sb.append(6); break;
					case 'N' : sb.append(6); break;
					case 'O' : sb.append(6); break;
					case 'P' : sb.append(7); break;
					case 'Q' : sb.append(7); break;
					case 'R' : sb.append(7); break;
					case 'S' : sb.append(7); break;
					case 'T' : sb.append(8); break;
					case 'U' : sb.append(8); break;
					case 'V' : sb.append(8); break;
					case 'W' : sb.append(9); break;
					case 'X' : sb.append(9); break;
					case 'Y' : sb.append(9); break;
					case 'Z' : sb.append(9); break;
				}
			}
			
			boolean chk = true;
			for(int i = 0; i < sb.length(); i++) {
				
				if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
					chk = false;
					break;
				}
			}
			
			if(chk) ans.append("YES");
			else ans.append("NO");
			ans.append("\n");
		}
		
		ans.deleteCharAt(ans.length() - 1);
		System.out.print(ans);
	}
}
