import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		String input = "";
		while(!(input = br.readLine()).equals("#")) {
			String[] temp = input.split(" ");
			
			String d = "";
			for(int i = 0; i < temp[0].length(); i++) {
				int a = temp[0].charAt(i) - 'a';
				int b = temp[1].charAt(i) - 'a';
				int c = temp[2].charAt(i) - 'a';
				
				int len = b - a;
				if(c + len < 0) {
					d += (char)(c + len + 123);
				} else if(c + len > 25) {
					d += (char)(c + len + 71);
				} else {
					d += (char)(c + len + 97);
				}
				
			}
			
			sb.append(temp[0] + " " + temp[1] + " " + temp[2] + " " + d + "\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
