package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test11_Recursion {
	private static int round = 0;
	private static int K;
	private static int answer = -1;
	private static int[] sorted;

	
	// 병합 정렬 1
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		
		int testCase = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[testCase];
		for(int i = 0; i < testCase; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sorted = new int[testCase];
		merge(arr, 0, testCase - 1);

		System.out.println(answer);
		
	}
	
	// 병합 정렬 재귀 호출 메서드
	public static void merge(int[] arr, int left, int right) {
		
		if(round > K) return;
		
		if(left < right) {
			int mid = (left + right) / 2;
			merge(arr, left, mid);
			merge(arr, mid+1, right);
			merge(arr, left, mid, right);
					
		}
		
	}
	
	// 병합 정렬 Sorted 메서드
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int i = left;
		int j = mid + 1;
		int index = 0;
		
		while (i <= mid && j <= right) {
			if(arr[i] <= arr[j]) {
				sorted[index] = arr[i];
				i++;
			} else {
				sorted[index] = arr[j];
				j++;
			}
			index++;
		}
		
		while (i <= mid) 
			sorted[index++] = arr[i++];

		while (j <= right) 
			sorted[index++] = arr[j++];

		i = left;
		index = 0;
		while (i <= right) {
			round++;
			if (round == K) {
				answer = sorted[index];
				break;
			} 
			arr[i++] = sorted[index++];
		}
		
	}

	
}
