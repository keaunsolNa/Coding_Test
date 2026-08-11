import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int M, N;

	public static void main(String[] args) throws IOException {
		test04();
	}

    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		boolean[] broken = new boolean[10];
		StringTokenizer st;
		
		if(M != 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) broken[Integer.parseInt(st.nextToken())] = true;
		} 
		
		int result = Math.abs(N - 100);
		
		for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean chk = false;
            for(int j = 0; j < len; j++) {
            	
                if(broken[str.charAt(j) - '0']) { 
                	chk = true; 
                    break; 
                }
                
            }
            
            if(!chk) {
            	int min = Math.abs(N - i) + len; 
            	result = Math.min(min, result);
            }
            
		}
		
		System.out.println(result);
		 
    }
}
