import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int S;
	private static int answer = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
			
		for(int i = 1; i <= N; i++) {
			boolean[] visited = new boolean[N];			
			combination(arr, visited, 0, N, i);
		}
		
		System.out.println(answer);
	}

	
	private static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		
	    if(r == 0) {
	        print(arr, visited, n);
	        return;
	    } 

	    for(int i = start; i < n; i++) {
	        visited[i] = true;
	        combination(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}
	
	private static void print(int[] arr, boolean[] visited, int n) {
    	
		long hab = 0;
        for (int i = 0; i < n; i++) 
            if (visited[i]) hab += arr[i];
        
        if(hab == S) answer++;
    }
}
