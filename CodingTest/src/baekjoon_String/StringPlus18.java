package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringPlus18 {
	
	public static void main(String[] args) throws IOException {
		test04();
	}

	
	// Decoder 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String input = br.readLine();
			
			for(int i = 0; i < input.length(); i++) {
				
				switch(input.charAt(i)) {
					case 'y' : sb.append('a'); break; 
					case 'Y' : sb.append('A'); break; 
					case 'a' : sb.append('e'); break;
					case 'A' : sb.append('E'); break;
					case 'e' : sb.append('i'); break;
					case 'E' : sb.append('I'); break;
					case 'i' : sb.append('o'); break;
					case 'I' : sb.append('O'); break;
					case 'o' : sb.append('u'); break;
					case 'O' : sb.append('U'); break;
					case 'u' : sb.append('y'); break;
					case 'U' : sb.append('Y'); break;
					default : sb.append(input.charAt(i)); 
				}
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	
}
