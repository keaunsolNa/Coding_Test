import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] right = new char[] {'y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'n', 'm'};
		List<Character> Right = new ArrayList<>();
		for(int i = 0; i < right.length; i++) Right.add(right[i]);
		
		while(true) {
		
			String input = br.readLine();
			if(input.equals("#")) break;
			
			boolean now = Right.contains(input.charAt(0)) ? true : false;
			int ans = 0;
			
			for(int i = 1; i < input.length(); i++) {
				
				boolean temp = Right.contains(input.charAt(i)) ? true : false;
				
				if(temp != now) { ans++; now = temp; };
			}
			
			System.out.println(ans);
		}
   }
}