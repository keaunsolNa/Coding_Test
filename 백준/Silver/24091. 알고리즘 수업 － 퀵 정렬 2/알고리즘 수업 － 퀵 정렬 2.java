import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static int K;
   public static void main(String[] args) throws IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N ; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		quickSort2(arr, 0, N - 1);
		
		if(K > 0) {
			System.out.println(-1);
		} else {
			for (int arr2 : arr) 
				System.out.print(arr2 +" ");
		}
	}
	
	private static void quickSort2(int[] arr, int left, int right) {

		if (left >= right) return; 

	    int pivot = partition2(arr, left, right); 

	    quickSort2(arr, left, pivot - 1); 
	    quickSort2(arr, pivot + 1, right); 
	}

	private static int partition2(int[] arr, int left, int right) {
	    int pivot = arr[right]; 
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (arr[j] <= pivot) { 
	        	++i; 
	            swap2(arr, i, j); 
	        }
	    }

	    if(i + 1 != right) {
	    	swap2(arr, i + 1, right); 
	    }
	    return i + 1; 
	}

	private static void swap2(int[] arr, int i, int j) {
		if(K == 0) {
			for (int arr2 : arr) {
				System.out.print(arr2 +" ");
			}
			System.exit(0);
		}
		K--;
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}