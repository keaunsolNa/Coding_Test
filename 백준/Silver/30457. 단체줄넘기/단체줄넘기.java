import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while(n --> 0) list.add(Integer.parseInt(st.nextToken()));
        
        Collections.sort(list, Collections.reverseOrder());
        
        int sum = 1;
        int target = list.get(0);
        list.remove((Object)target);
        
        for(int i = 0; i < list.size(); i++) {
        	
        	if(list.isEmpty()) break;
        	
        	if(list.get(i) < target) {
        		
        		target = list.get(i);
        		list.remove((Object)target);
        		sum++;
        		i--;
        		
        	} else continue;
        	
        }
        
        if(!list.isEmpty()) {
        	
            target = list.get(0);
            sum++;
            list.remove((Object)target);
            
            for(int i = 0; i < list.size(); i++) {
            	
            	if(list.isEmpty()) break;
            	
            	if(list.get(i) < target) {
            		
            		target = list.get(i);
            		list.remove((Object)target);
            		sum++;
            		i--;
            		
            	} else continue;
            	
            }
        }

        
        System.out.println(sum);
    }
}
