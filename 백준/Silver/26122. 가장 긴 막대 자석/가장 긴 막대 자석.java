import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		String S = br.readLine();
		Stack<Integer> n = new Stack<>();
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> v = new ArrayList<>();
		boolean flag = false;
		

		for(int i = 0; i < S.length(); i++) {
			
            if(S.charAt(i) == 'N') {
            	
                n.push(1);
                
                if(!flag) {
                	
                    v.add(s.size());
                    while(!s.isEmpty()) s.pop();
                    
                }
                
                flag = true;
                
            } else if(S.charAt(i) == 'S') {
            	
                s.push(1);
                
                if(flag) {
                	
                    v.add(n.size());
                    while(!n.isEmpty()) n.pop();
                    
                }
                
                flag = false;
            }
        }
        

		if(flag) v.add(n.size());
		else v.add(s.size());
		

		v.add(0);
        
        int res = 0;
        
        for(int i = 1; i < v.size(); i++) res = Math.max(res, 2 * Math.min(v.get(i - 1), v.get(i)));
        
        System.out.println(res);
   }
}