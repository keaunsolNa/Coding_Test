import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Deque<Integer> deq = new LinkedList<>();
		for(int i = 1; i <= N; i++)  deq.add(i);
		
		while(true) {
			
			if(deq.size() < K) { System.out.println(deq.pollFirst()); return; }
			
			int start = deq.pollFirst();
			deq.addLast(start);
			
			for(int i = 0; i < K - 1; i++) deq.pollFirst();
		}
	}
}
