import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<Integer, int[]> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < M; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	int k = Integer.parseInt(st.nextToken());
        	int s = Integer.parseInt(st.nextToken());
        	int e = Integer.parseInt(st.nextToken());

        	if(map.containsKey(k)) {
        		
        			
    			if(s < map.get(k)[1]) {
    				
    				sb.append("NO" + "\n");
    				
    			} else {
    				
    				map.get(k)[0] = s;
    				map.get(k)[1] = e;
    				sb.append("YES" + "\n");
    			}
        		
        		
        	} else {
        		
        		int[] temp = new int[2];
        		temp[0] = s;
        		temp[1] = e;
        		map.put(k, temp);
        		sb.append("YES" + "\n");
        	}
        	

        }
        
        System.out.println(sb);
   }
}