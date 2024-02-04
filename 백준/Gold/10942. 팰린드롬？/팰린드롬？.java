import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());

    	int arr[][] = new int[n + 1][n + 1];
    	int input[] = new int[n + 1];

    	for(int i = 1; i <= n; i++) {
    		
    		int temp = Integer.parseInt(st.nextToken());
    		input[i] = temp;
    		
    		for(int j = 1; j <= i; j++) {
    			
    			if(i == j) arr[j][i] = 1;
    			
    			else if(i - j == 1) arr[j][i] = (input[i] == input[j] ? 1 : 0);
    			
    			else arr[j][i] = (input[i] == input[j] && arr[j + 1][i - 1] == 1) ? 1 : 0;
    		}
    	}
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	while(t --> 0) {
    	
    		st = new StringTokenizer(br.readLine());
    		
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		
    		sb.append(arr[a][b]).append("\n");
    	}
    	
    	System.out.println(sb);
    }
}
