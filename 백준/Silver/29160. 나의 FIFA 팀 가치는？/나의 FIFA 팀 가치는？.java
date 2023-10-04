import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Integer>[] pq = new PriorityQueue[12];
        
        for(int i = 0 ; i <= 11 ; i++) pq[i] = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < n ; i++) {
        	
            st = new StringTokenizer(br.readLine());
            int position = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            pq[position].add(value);
            
        }
        
        int teamValue = cal(pq,k);
        System.out.println(teamValue);
    }

    private static int cal(PriorityQueue<Integer>[] pq, int k) {
    	
        int[] teamValue = new int[12];
        
        for(int i = 0 ; i < k ; i++) {
        	
            for(int j = 1 ; j <= 11 ; j++) { 
            	
                if(!pq[j].isEmpty() && teamValue[j] < pq[j].peek()){
                	
                    pq[j].add(teamValue[j]);
                    teamValue[j] = pq[j].poll();
                }
            }
            
            for(int j = 1 ; j <= 11 ; j++) teamValue[j] = Math.max(teamValue[j] - 1, 0);
            
            for(int j = 1 ; j <= 11 ; j++) {
            	
                if(!pq[j].isEmpty() && teamValue[j] < pq[j].peek()) {
                	
                    pq[j].add(teamValue[j]);
                    teamValue[j] = pq[j].poll();
                }
            }
            
        }
        
        int sumTeamValue = 0;
        for(int j = 1 ; j <= 11 ; j++) sumTeamValue += teamValue[j];
        
        return sumTeamValue;
    }
}
