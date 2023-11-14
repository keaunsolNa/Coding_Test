import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			
			int n = Integer.parseInt(br.readLine());
			String waring = br.readLine();
			int get = 0;
			
			for(int j = 0; j < n; j++) {
				
				String input = br.readLine();
				if(solve(waring, input)) get++;
				
			}
			
			sb.append("Data Set " + (i + 1) + ":\n" + get +"\n\n");
		}
		
		System.out.print(sb);
	}
	
	private static boolean solve(String waring, String input) {
		
		for(char c : waring.toCharArray()) 
			if(input.contains(String.valueOf(c))) return true;
		
		return false;
	}
}