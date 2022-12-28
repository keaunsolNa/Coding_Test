package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Sort05 {
	
	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 점수 계산
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[8];
		int[] idx = new int[8];
		int[] sort = new int[5];
		for(int i = 0; i < 8; i++) {
			int point = Integer.parseInt(br.readLine());
			arr[i] = point;
			idx[i] = point;
		}
		
		
		Arrays.sort(arr);
		
		int sum = 0;
		int idx2 = 0;
		for(int i = 3; i < 8; i++) {
			sum += arr[i];
			
			for(int j = 0; j < 8; j++) {
				if(arr[i] == idx[j]) {
					sort[idx2] = j+1;
					idx2++;
				}
			}
		}
		
		Arrays.sort(sort);
		System.out.println(sum);
		for (int i : sort) {
			System.out.print(i + " ");
		}
	}
	
	// 알고리즘 수업 - 선택 정렬 2
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		
		int cnt = 0;
		for(int last = n; last >= 2; last--) {
			
			int max = Integer.MIN_VALUE;
			int i = 0;
			
			for(int idx = 1; idx <= last; idx++) {
	            if (max < arr[idx]) {
	                max = arr[idx];
	                i = idx;
	            }
			}    
	            
            if (last != i) {
                int tmp = arr[last];
                arr[last] = arr[i];
                arr[i] = tmp;
            
	            if (++cnt == k) {
	                for (int j = 1; j <= n; j++) System.out.print(arr[j] + " ");
	                return;
	            }
            }
		}
		
		System.out.println(-1);
	}	
	
	// 알고리즘 수업 - 선택 정렬 5
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];
		int[] arr2 = new int[n + 1];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= n; i++) arr2[i] = Integer.parseInt(st.nextToken());
		
		boolean flag1 = true;
		for(int i = 1; i <= n; i++) if(arr[i] != arr2[i]) flag1 = false;
		
		if(flag1) {
			System.out.println(1);
			return;
		}
		
		for(int last = n; last >= 2; last--) {
			
			int max = Integer.MIN_VALUE;
			int i = 0;
			
			for(int idx = 1; idx <= last; idx++) {
	            if (max < arr[idx]) {
	                max = arr[idx];
	                i = idx;
	            }
			}    
	            
            if (last != i) {
                int tmp = arr[last];
                arr[last] = arr[i];
                arr[i] = tmp;
            
                boolean flag = true;
	            for(int c = 1; c <= n; c++) {
	            	if(arr[c] != arr2[c]) {
	            		flag = false;
	            	}
	            }
	            
	            if(flag) {
            		System.out.print(1);
            		return;
	            }
            }
		}
		
		System.out.print(0);
		
	}
    
	// 이건 꼭 풀어야 해!
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
        for (int i = 1; i <= N; i++) arr[i] += arr[i-1];
        
		while(Q --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int L = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			System.out.println(getRangedSum(arr, L, R));
		}
	}
	
	// 누적 합 알고리즘
	public static int getRangedSum(int[] arr, int L, int R) {
        return arr[R] - arr[L-1];
    }
	
	// 스네이크버드
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		long L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if(L >= arr[i]) L++;
			else break;
		}
		
		System.out.println(L);
		
	}
	
	// 줄 세우기
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        String[] name = new String[p];
        
        for(int i = 0; i < p; i++) name[i] = br.readLine();
        
        String[] sort = name.clone();
        String[] sortR = name.clone();
        
        Arrays.sort(sort);
        Arrays.sort(sortR, Collections.reverseOrder());
        
        boolean flag = true;
        boolean flag2 = true;
        for(int i = 0; i < p; i++) {
        	if(!(name[i].equals(sort[i])))flag = false;
        	if(!(name[i].equals(sortR[i])))flag2 = false;
        }
        
        if(flag) System.out.println("INCREASING");
        else if(flag2) System.out.println("DECREASING");
        else System.out.println("NEITHER");
	}
	
	// 정열적인 정렬 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		for (int i : arr) sb.append(i + " ");
		
		System.out.println(sb);
	}
	
	// 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
	}
	
	// 
	public static void test09() throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        		
	}
	
	//
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}
	
	
}
