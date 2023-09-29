import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		int ans = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i, s = 0; N --> 0;) {
			
			i = Integer.parseInt(st.nextToken());
			pq.add(i);
			s += i;
			
			while(s >= M) {
				ans++;
				s -= pq.poll() * 2;
			}
		}
		
		System.out.println(ans);
   }
}