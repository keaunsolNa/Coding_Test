import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static class Truck {
		
		int weight;
		int move;
		
		public Truck(int weight) {
			this.weight = weight;
			this.move = 1;
		}
		
		public void moving() {
			move++;
		}
			
	}
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		Queue<Truck> waitQ = new LinkedList<>();
		Queue<Truck> moveQ = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) 
			waitQ.offer(new Truck(Integer.parseInt(st.nextToken())));

        int answer = 0;
        int curWeight = 0;

        while (!waitQ.isEmpty() || !moveQ.isEmpty()) {
        	
            answer++;

            if (moveQ.isEmpty()) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                continue;
            }

            for (Truck t : moveQ) t.moving();

            if (moveQ.peek().move > W) {
            	
                Truck t = moveQ.poll();
                curWeight -= t.weight;
                
            }

            if (!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= L) {
            	
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                
            }
        }
        
        System.out.println(answer);
   }
}