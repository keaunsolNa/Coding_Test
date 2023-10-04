import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	private static long K;
	private static long cnt = 0;
	private static boolean flag = false;
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Long.parseLong(st.nextToken());
		
		int[] arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());

		heapSort2(arr);
	}
	

	private static void heapSort2(int[] arr) {
	    
		int n = arr.length - 1;
		buildMinHeap2(arr, n);
       
		for (int i = n ; i >= 2; i--) {
			swap2(arr, 1, i);
			heapify2(arr, 1, i - 1);
		}

		if(!flag) System.out.println(-1);

	}

    private static void buildMinHeap2(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
        	heapify2(arr, i, n);
        }
    }
    
	private static void heapify2(int[] arr, int e, int n) {
		
		int left = 2 * e;
        int right = left + 1;
        int largest = 0;
        
        if (right <= n) {
        	
            if (arr[left] > arr[right]) largest = right;
            else largest = left;
            
        } 
        
        else if (left <= n) largest = left;
        
        else return;
        
        if (arr[largest] < arr[e]) { 
            swap2(arr, e, largest);
            heapify2(arr, largest, n);
        }
	}
	
    private static void swap2(int[] arr, int z, int x) {
    	
        cnt++;
        int temp = arr[z];
        arr[z] = arr[x];
        arr[x] = temp;
        
        if(cnt == K) { 

        	if(arr[z] < arr[x]) System.out.print(arr[z] + " " + arr[x]);
        	else System.out.println(arr[x] + " " + arr[z]);
            System.exit(0);
            
        }
        
    }
}