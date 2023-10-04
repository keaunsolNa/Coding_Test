import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Long> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		long max = 0;
		long ans = 0;
		
		for(int i = 0; i < n; i++) {
			long target = Long.parseLong(br.readLine());
			max = Math.max(max, target);
			
			if(stack.isEmpty()) stack.push(target);
			
			else {
				
				if(stack.peek() < target) {
					
					ans += target - stack.pop();
					stack.push(target);
					
				}
				
				else if(stack.peek() > target) {
					
					stack.pop();
					stack.add(target);
					
				}
			}
		}
		
		while(!stack.isEmpty()) {
			long num = stack.pop();
			ans += max - num;
		}
		
		System.out.println(ans);
   }
}