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

        int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Deque<Integer> deq = new LinkedList<>();
		for(int i = 1; i <= n; i++)  deq.add(i);
		
		while(true) {
			
			if(deq.size() < k) { System.out.println(deq.poll()); return; }
			
			deq.addLast(deq.poll());
			
			for(int i = 0; i < k - 1; i++) deq.poll();
		}
	}
}


		