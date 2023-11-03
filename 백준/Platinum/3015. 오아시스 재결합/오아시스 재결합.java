import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
	
    private static class Pair {
		
		int height;
		int cnt;
		
		Pair(int height, int cnt) {
			this.height = height;
			this.cnt = cnt;
		}
	}
 
    public static void main(String[] args) throws IOException {
	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Pair> stack = new Stack<>();
		long cnt = 0;
		
		for(int i = 0; i < N; i++) {
			
			int n = Integer.parseInt(br.readLine());
			Pair pair = new Pair(n, 1);
			
			while(!stack.empty() && stack.peek().height <= n) {
				
				Pair pop = stack.pop();
				cnt += pop.cnt;
				if(pop.height == n) pair.cnt += pop.cnt;
			}
			
			if(!stack.empty()) cnt++;
			
			stack.push(pair);
		}

		System.out.println(cnt);
   }
}