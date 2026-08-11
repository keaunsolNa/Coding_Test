import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while((input = br.readLine()) != null) {
			
			for(int i = 0; i < input.length(); i++) {

				switch(input.charAt(i)) {
					case 'i' : sb.append('e'); break;
					case 'e' : sb.append('i'); break;
					case 'I' : sb.append('E'); break;
					case 'E' : sb.append('I'); break;
					default : sb.append(input.charAt(i)); break;
				}
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}
