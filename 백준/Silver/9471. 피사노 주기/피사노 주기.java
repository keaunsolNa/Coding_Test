import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
         
    	for(int i = 0; i < n; i++) {
        
    		String[] tmp = br.readLine().split(" ");
    		int m = Integer.parseInt(tmp[1]);
             
    		int a = 1;
    		int b = 1;
    		int count = 0;
             
    		while(true) {
    			int next = (a + b) % m;
    			a = b;
    			b = next;
    			count ++;
    			
    			if (a == 1 && b == 1) break;
    		}
             
             sb.append(i + 1).append(" ").append(count).append("\n");
         }
     
         System.out.println(sb);
    }
    
    
}
