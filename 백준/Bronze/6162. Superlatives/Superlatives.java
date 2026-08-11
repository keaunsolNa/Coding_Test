import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        
        int idx = 1;
        while(T --> 0) {

        	st = new StringTokenizer(br.readLine());
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	
        	sb.append("Data Set ").append(idx).append(":").append("\n");

        	if(A <= B) {
        		sb.append("no drought"); 
        		sb.append("\n");
            	sb.append("\n");
            	idx++;
        		continue;
        	}
        		
        	int time = 5;
        	while(A > B * time) time *= 5;
        		
    		for(int i = 5; i <= time - 1; i *= 5) sb.append("mega ");
    		sb.append("drought");
    		sb.append("\n");
    		sb.append("\n");
    		idx++;
        	
        }
        
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	
	}
}
