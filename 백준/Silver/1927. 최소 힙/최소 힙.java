import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				if(pq.peek() == null) {
					sb.append(0).append("\n");
					pq.poll();
				} else {
					sb.append(pq.poll()).append("\n");
				}
			} else {
				pq.add(input);
			}
		}
		
		System.out.println(sb);
	}
}
