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
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

        Queue<employee>[] lines = new LinkedList[M];
        for(int i = 0; i < M; i++) lines[i] = new LinkedList<employee>();
        
	
        for(int i = 0; i < N; i++) {
        	
            st = new StringTokenizer(br.readLine());

            boolean isDeka = false;
            int D = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            int L = i%M;

            if(i == K) isDeka = true;

            lines[L].add(new employee(isDeka, D, H, L));
        }

        PriorityQueue<employee> firsts = new PriorityQueue<employee>();

        for(int i = 0; i < M; i++) {
        	
            if(lines[i].size() > 0) firsts.add(lines[i].poll());
            else break;
        }
        
        int cnt = 0;
        while(true) {
        	
            ++cnt;
            employee curEmployee = firsts.poll();

            if(curEmployee.isDeka) break;

            if(lines[curEmployee.L].size() > 0) 
            	firsts.add(lines[curEmployee.L].poll());
        }

        System.out.println(cnt-1);
	}

    private static class employee implements Comparable<employee>{
    	
        boolean isDeka; 
        int D;
        int H;
        int L;    

        public employee(boolean isDeka, int D, int H, int L) {
            this.isDeka = isDeka;
            this.D = D;
            this.H = H;
            this.L = L;
        }

		@Override
		public int compareTo(employee o) {
			
			if (this.D == o.D) {
				
				if(this.H == o.H) return this.L - o.L;
				
				else return o.H - this.H;
			}
			
			return o.D - this.D;
			
		}
    }
}
