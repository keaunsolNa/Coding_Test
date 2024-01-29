import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] title = new String[n];
        int[] powerArr = new int[n];

        for(int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	title[i] = st.nextToken();
        	powerArr[i] = Integer.parseInt(st.nextToken());
        	
        }

        for(int i = 0; i < m; i++) {
        	
        	int power = Integer.parseInt(br.readLine());
        	
        	int start = 0;
        	int end = n - 1;
        	
        	while(start <= end) {
        		
        		int mid = (start + end) / 2;
        		
        		if(powerArr[mid] < power) start = mid + 1;
        		
        		else end = mid - 1;
        	}
        	
        	sb.append(title[start]).append("\n");
        }
        
        System.out.print(sb);
    }
}
