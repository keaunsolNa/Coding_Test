import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
    public static class Register {
		int num;
		String command;
		
		public Register(int num, String command) {
			this.num  = num;
			this.command = command;
		}
		
		int D() { return (num * 2) % 10000; }
		
		int S() { return num == 0 ? 9999 : num - 1; }
		
		int L() { return num % 1000 * 10 + num / 1000; }
		
		int R() { return num % 10 * 1000 + num / 10; }
			
	}
   
    public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			
			boolean[] visited = new boolean[10000];
			visited[A] = true;
			
			Queue<Register> que = new LinkedList<>();
			que.add(new Register(A, ""));
			
			while(!que.isEmpty()) {
				Register cur = que.poll();
				
				if(cur.num == B) {
					sb.append(cur.command).append("\n");
					break;
				}
				
				if(!visited[cur.D()]) {
					que.add(new Register(cur.D(), cur.command + "D"));
					visited[cur.D()] = true;
				}
				
				if(!visited[cur.S()]) {
					que.add(new Register(cur.S(), cur.command + "S"));
					visited[cur.S()] = true;
				}
				
				if(!visited[cur.L()]) {
					que.add(new Register(cur.L(), cur.command + "L"));
					visited[cur.L()] = true;
				}
				
				if(!visited[cur.R()]) {
					que.add(new Register(cur.R(), cur.command + "R"));
					visited[cur.R()] = true;
				}
			}
		}
		
		System.out.println(sb);
   
    }
}