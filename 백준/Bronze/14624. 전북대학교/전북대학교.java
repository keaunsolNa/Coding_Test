import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if(N % 2 == 0) {
        	System.out.println("I LOVE CBNU");
        	return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) sb.append("*");
        sb.append("\n");
        
        int mid = Math.round(N / 2) + 1;
        
        for (int i = 0; i < mid; i++) {
        	
            if (i == 0) {
            	
            	for(int j = 0; j < N / 2; j++) sb.append(" ");
            	sb.append("*");
            	sb.append("\n");
            	
            }
            
            
            else {
            	
                int center = (i == 1) ? i : i * 2 - 1;
                for(int j = 0; j < N / 2 - i; j++) sb.append(" ");
                sb.append("*");
                
                for(int j = 0; j < center; j++) sb.append(" ");
                sb.append("*");
                sb.append("\n");
                
            }
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
        
	}
}
