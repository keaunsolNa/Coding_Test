import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		String EorD = input.split(" ")[0];
		
		if(EorD.equals("E")) {

			String text = input.split(" ")[1];
			
			if(text.length() == 1) {
				System.out.println(text + 1);
				return;
			}
			
			Set<Character> set = new HashSet<>();
			for(int i = 0; i < text.length(); i++) set.add(text.charAt(i));
			if(set.size() == 1) {
				for (Character character : set) {
					sb.append(character).append(text.length());
					System.out.println(sb);
					return;
				}
			}
			
			char prev = text.charAt(0);
			int idx = 1;
			
			for(int i = 1; i < text.length(); i++) {
				
				if(text.charAt(i) == prev) idx++;
				else {
					
					sb.append(prev);
					sb.append(idx);
					prev = text.charAt(i);
					idx = 1;
				}
			}
			
			if(sb.charAt(sb.length() - 1) != prev) sb.append(prev).append(idx);
			
			
		} else {
			
			String text = input.split(" ")[1];
			int idx = 0;
			char prev = ' '	;
			for(int i = 0; i < text.length(); i++) {
				
				switch(text.charAt(i)) {
					case '1' :
					case '2' :
					case '3' :
					case '4' :
					case '5' :
					case '6' :
					case '7' : 
					case '8' :
					case '9' :
						idx = Character.getNumericValue(text.charAt(i)); 
						for(int j = 0; j < idx; j++) sb.append(prev);
						break;
					default : prev = text.charAt(i);
				}
				
			}
			
		}
		System.out.print(sb);
	}
}
