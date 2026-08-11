package baekjoon_Sort;

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

public class Sort06 {
	
    
	public static void main(String[] args) throws IOException {
		test01();
	}	
	
	// 23969번 - 알고리즘 수업 - 버블 정렬 2
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N ; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = N; i >= 2; i--) {
			
			for(int j = 0; j < N - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					K--;
					
					if(K == 0) {
						for (int l : arr) {
							System.out.print(l +" ");
						}
						System.exit(0);
					}
				}
			}
		}
		
		System.out.println(-1);
	}
	
	// 24052번 - 알고리즘 수업 - 삽입 정렬 2
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N ; i++) arr[i] = Integer.parseInt(st.nextToken());
		
	    for (int i = 1; i < N; i++) {
	        int loc = i - 1;
	        int newItem = arr[i];

	        while (loc >= 0 && newItem < arr[loc]) {
	            arr[loc + 1] = arr[loc];
	            loc--;
	            K--;
	            
	            if(K == 0) {
	            	for (int j : arr) System.out.print(j + " ");
	            	System.exit(0);
	            }
	            
						
	        }
	        if (loc + 1 != i) {
	            arr[loc + 1] = newItem;
	            K--;
	            if(K == 0) {
	            	for (int j : arr) System.out.print(j + " ");
	            	System.exit(0);
	            }
	        }
	    }
	    
	    System.out.println(-1);
	    
	}
	
	// 24090번 - 알고리즘 수업 - 퀵 정렬 1
	private static int K;
	

	// 24091번 - 알고리즘 수업 - 퀵 정렬 2
	public static void test04() throws IOException {
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
			for (int arr2 : arr) 
				System.out.print(arr2 +" ");
			System.exit(0);
		}
		K--;
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	
}
