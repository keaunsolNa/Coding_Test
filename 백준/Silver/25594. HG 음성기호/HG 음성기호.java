import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] HG = new String[] {
				"aespa", "baekjoon", "cau", "debug", "edge", "firefox", "golang",
				"haegang", "iu", "java", "kotlin", "lol", "mips", "null", "os",
				"python", "query", "roka", "solvedac", "tod", "unix", "virus",
				"whale", "xcode", "yahoo", "zebra"};
		
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i++) {
			
			char start = input.charAt(i);
			String target = HG[(int)start - 'a'];
			
            if(input.length() < i + target.length()) {
                            
				System.out.println("ERROR!");
				return;
			}
            
			if(target.equals(input.substring(i, i + target.length()))) {
				
				i += target.length() - 1;
				sb.append(target.charAt(0));
				
			} else {
				
				System.out.println("ERROR!");
				return;
				
			}
		}
		
		System.out.println("It's HG!");
		System.out.print(sb);
   }
}