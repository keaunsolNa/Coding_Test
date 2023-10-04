import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    private static int[] present;
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		present = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) present[i] = Integer.parseInt(st.nextToken());

		int left = 1;
		int right = N;
		
		while(left <= right) {
			int mid = (left + right) /2;
			
			if(check(mid, X, N)) right = mid - 1; 
			else left = mid + 1;
			
		}
		
		System.out.println(left);
   }
    
    public static boolean check(int mid, int X, int N) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int i = 0; i < mid; i++) que.add(0);
 
        for(int i = 1; i <= N; i++) {
        	
            int time = que.poll();
            if(time + present[i] > X) return false;
            que.offer(time + present[i]);
        }

        return true;
    }
}