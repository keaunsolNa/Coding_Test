import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    private static int[] board;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		board = new int[101];
		for(int i = 1; i < board.length; i++) board[i] = i;
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			board[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
			
		}
		
		while(M --> 0) {
			
			st = new StringTokenizer(br.readLine());
			board[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(bfs(1));
	}
	
	public static int bfs(int start) {
		
		int[] check = new int[101];
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		check[start] = 0;
		
		while(true) {
			
			int visit = q.poll();
			
			for(int i = 1; i < 7; i++) {
				
				int newNode = visit + i;
				
				if(newNode > 100) continue;
				
				if(check[board[newNode]] == 0) {
					
					q.add(board[newNode]);
					check[board[newNode]] = check[visit] + 1;
					
				}
				
				if(board[newNode] == 100) return check[100];
			}
		}
	}
}