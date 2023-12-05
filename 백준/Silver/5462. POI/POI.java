import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    private static class Participant implements Comparable<Participant>{
		
		int point;
		boolean[] solve;
		int totalSolve;
		int number;
		
		public Participant(int point, boolean[] solve, int totalSolve, int number) {
			
			this.point = point;
			this.solve = solve;
			this.totalSolve = totalSolve;
			this.number = number;
		}
		
		@Override
		public int compareTo(Participant o) {

			if(this.point != o.point) return o.point - this.point;
			else if(this.totalSolve != o.totalSolve) return o.totalSolve - this.totalSolve;
			else return this.number - o.number;
			
		}
		
	}
    
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        int[] point = new int[T];
        for(int i = 0; i < T; i++) point[i] = N;
        
        Participant[] pp = new Participant[N];
        
        for(int i = 0; i < N; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	boolean[] solve = new boolean[T];
        	int totalSolve = 0;
        	
        	for(int j = 0; j < T; j++) {
        		
        		int getOrNot = Integer.parseInt(st.nextToken());
        		if(getOrNot == 1) { point[j]--; solve[j] = true; totalSolve++; }
        		
        	}
        	
        	pp[i] = new Participant(0, solve, totalSolve, i + 1);
        }
        
        for(int i = 0; i < N; i++) {
        	
        	int getPoint = 0;
        	for(int j = 0; j < T; j++) if(pp[i].solve[j]) getPoint += point[j];
        	pp[i].point = getPoint;
        	
        }
        
        PriorityQueue<Participant> pq = new PriorityQueue<>();
        for(int i = 0; i < pp.length; i++) pq.add(pp[i]);
        
        int rank = 1;
        while(!pq.isEmpty()) {
        	
        	Participant temp = pq.poll();
        	
        	if(temp.number == P) {
        		System.out.println(temp.point + " " + rank);
        		break;
        	}
        	
        	rank++;
        }
	}
}
