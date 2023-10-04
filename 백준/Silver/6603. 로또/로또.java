import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k;
		
		while((k = Integer.parseInt(st.nextToken())) != 0) {

			int[] arr = new int[k];
			boolean[] visited = new boolean[k];
			
			for(int i = 0; i < k; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			combination(arr, visited, 0, k, 6);
			
			sb.append("\n");
			st = new StringTokenizer(br.readLine());
		}
		
		System.out.println(sb);
	}

	
	private static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		
	    if(r == 0) {
	        print(arr, visited, n);
	        return;
	    } 

	    for(int i=start; i<n; i++) {
	        visited[i] = true;
	        combination(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}
	
	private static void print(int[] arr, boolean[] visited, int n) {
    	
        for (int i = 0; i < n; i++) 
            if (visited[i]) sb.append(arr[i] + " ");
        
        sb.append("\n");
    }
}
