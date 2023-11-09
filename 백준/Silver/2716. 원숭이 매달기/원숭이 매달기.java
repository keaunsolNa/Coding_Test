import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			
			char[] input = br.readLine().toCharArray();
			Stack<Character> stack = new Stack<>();
			int answer = 0;
			
			for(int i = 0; i < input.length; i++) {
				
				if(input[i] == '[') stack.add('[');
				else {
					
					answer = Math.max(answer, stack.size());
					stack.pop();
				}
			}
			System.out.println((int)Math.pow(2, answer));
		}
   }
}