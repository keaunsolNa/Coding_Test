import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String[] two = new String[] {"2", "22", "222"};
		String[] three = new String[] {"3", "33", "333"};
		String[] four = new String[] {"4", "44", "444"};
		String[] five = new String[] {"5", "55", "555"};
		String[] six = new String[] {"6", "66", "666"};
		String[] seven = new String[] {"7", "77", "777", "7777"};
		String[] eight = new String[] {"8", "88", "888"};
		String[] nine = new String[] {"9", "99", "999", "9999"};
		
		
		for(int i = 1; i <= N; i++) {
			
			String input = br.readLine();

			for(int j = 0; j < input.length(); j++) {
				
				switch(input.charAt(j)) {
					case 'a' : 
					case 'b' :
					case 'c' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '2') sb.append(" ");
						sb.append(two[input.charAt(j) - 97]);
						break;
						
					case 'd' :
					case 'e' :
					case 'f' :

						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '3') sb.append(" ");
						sb.append(three[input.charAt(j) - 100]);
						break;
						
					case 'g' :
					case 'h' :
					case 'i' :

						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '4') sb.append(" ");
						sb.append(four[input.charAt(j) - 103]);
						break;
						
					case 'j' : 
					case 'k' :
					case 'l' : 
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '5') sb.append(" ");
						sb.append(five[input.charAt(j) - 106]);
						break;
						
					case 'm' :
					case 'n' :
					case 'o' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '6') sb.append(" ");
						sb.append(six[input.charAt(j) - 109]);
						break;
						
					case 'p' : 
					case 'q' :
					case 'r' :
					case 's' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '7') sb.append(" ");
						sb.append(seven[input.charAt(j) - 112]);
						break;
						
					case 't' :
					case 'u' :
					case 'v' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '8') sb.append(" ");
						sb.append(eight[input.charAt(j) - 116]);
						break;
						
					case 'w' :
					case 'x' :
					case 'y' :
					case 'z' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '9') sb.append(" ");
						sb.append(nine[input.charAt(j) - 119]);
						break;
					
					case ' ' : 
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') sb.append(" ");
						sb.append("0");
						break;
					
					
				}
			}
			
			sb.insert(0, "Case #" + i+": ");
			System.out.println(sb);
			sb.setLength(0);
		}
	}
}
