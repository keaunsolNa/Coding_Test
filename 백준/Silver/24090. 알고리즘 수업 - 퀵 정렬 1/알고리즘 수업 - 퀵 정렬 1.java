import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

	private static int K;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N ; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		quickSort(arr, 0, N - 1);
		
		System.out.println(-1);
	}

	private static void quickSort(int[] arr, int left, int right) {

		if (left >= right) return; 

	    int pivot = partition(arr, left, right); 

	    quickSort(arr, left, pivot - 1); 
	    quickSort(arr, pivot + 1, right); 
	}

	private static int partition(int[] arr, int left, int right) {
	    int pivot = arr[right]; 
	    int i = left - 1;
	    for (int j = left; j < right; j++) {
	        if (arr[j] <= pivot) { 
	        	++i; 
	            swap(arr, i, j); 
	        }
	    }

	    if(i + 1 != right) {
	    	swap(arr, i + 1, right); 
	    }
	    return i + 1; 
	}

	private static void swap(int[] arr, int i, int j) {
		K--;
		if(K == 0) {
			System.out.println(arr[j] + " " + arr[i]);
			System.exit(0);
		}
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}
