import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int Q;
	private static int K;
	private static int[] A;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		
		select(0, N - 1, Q);
		
		System.out.println(-1);
	}

	public static int select(int p, int r, int q) {
	    if (p == r) return A[p];  

	    int t = partition(p, r);  
	    int k = t - p + 1;           
	    
	    if (q < k) return select(p, t - 1, q);  
	    else if (q == k) return A[t];          
	    else return select(t + 1, r, q - k);  
	    
	}

	public static int partition(int p, int r) {
		
	    int x = A[r];  
	    int i = p - 1; 

	    for (int j = p; j < r; j++) {
	    	
	        if (A[j] <= x) {
	            i++;
	            swap2(i, j);
	        }
	    }
	    
	    if(i + 1 != r) {
	    	swap2(i + 1, r);
	    }
	    return i + 1;
	    
	}

	public static void swap2(int i, int j) {

		if(K > 0) {
			K--;
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
	    
	    if(K == 0) {
	    	
	    	System.out.println(Math.min(A[i], A[j]) + " " + Math.max(A[i], A[j]));
	    	System.exit(0);
	    	
	    }
	}
}
