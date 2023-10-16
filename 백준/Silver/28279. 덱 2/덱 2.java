import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	int order = Integer.parseInt(st.nextToken());

        	switch (order) {
        	
				case 1 : dq.addFirst(Integer.parseInt(st.nextToken())); continue;
				
				case 2 : dq.addLast(Integer.parseInt(st.nextToken())); continue;
				
				case 3 : 
					if(dq.isEmpty()) sb.append(-1);
					else sb.append(dq.pollFirst());
					break;
					
				case 4 : 
					if(dq.isEmpty()) sb.append(-1);
					else sb.append(dq.pollLast());
					break;
					
				case 5 : sb.append(dq.size()); break;
				
				case 6 : sb.append(dq.isEmpty() ? 1 : 0); break;
				
				case 7 : 
					if(dq.isEmpty()) sb.append(-1);
					else sb.append(dq.peekFirst());
					break;
					
				case 8 : 
					if(dq.isEmpty()) sb.append(-1);
					else sb.append(dq.peekLast());
					break;
					
    	
        	}	
        
        	sb.append('\n');
        }

        System.out.print(sb);
   }
}