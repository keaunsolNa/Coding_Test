import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] text = br.readLine().split(" ");
		String[] ban = {"i" , "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
		StringBuilder sb = new StringBuilder();

		sb.append((text[0].charAt(0)+"").toUpperCase());
		
		for(int i = 1; i < text.length; i++) {
			
			boolean flag = true;
			
			for(int j = 0; j < ban.length; j++) {
				
				if(text[i].equals(ban[j])) {
					
					flag = false;
					break;
					
				}
			}
			
			if(flag) sb.append((text[i].charAt(0)+"").toUpperCase()); 
		}
		
		System.out.println(sb);
	}
}
