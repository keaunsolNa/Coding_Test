package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Sort04 {
	
	public static void main(String[] args) throws IOException {
		test05();
	}
	
	// 수 정렬하기 4
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Comparator.reverseOrder());
		for (int i : arr) sb.append(i).append("\n");
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
	}
	
	// 중복 빼고 정렬하기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new HashSet<>();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		while(N --> 0) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		List<Integer> sortList = new ArrayList(set);
		Collections.sort(sortList);
		for (Integer integer : sortList) sb.append(integer).append(" ");
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 아시아 정보올림피아드
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, int[]> map = new TreeMap<>(Collections.reverseOrder());
		StringTokenizer st;
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int nation = Integer.parseInt(st.nextToken());
			int student = Integer.parseInt(st.nextToken());
			int point = Integer.parseInt(st.nextToken());
			
			map.put(point, new int[] {nation, student});
			
		}

		Iterator<Integer> iter = map.keySet().iterator();
		
		while(true) {
			int key1 = iter.next();
			int firstNation = map.get(key1)[0];
			int firstStudㄷnt = map.get(key1)[1];
			
			int key2 = iter.next();
			int secondNation = map.get(key2)[0];
			int secondStudent = map.get(key2)[1];
			
			int threeNation = 0;
			int threeStudent = 0;
			if(firstNation == secondNation) {
				int key3 = iter.next();
				
				while(map.get(key3)[0] == firstNation) {
					key3 = iter.next();
				}
				
				threeNation = map.get(key3)[0];
				threeStudent = map.get(key3)[1];
			} else {
				int key3 = iter.next();
				threeNation = map.get(key3)[0];
				threeStudent = map.get(key3)[1];
			}
			
			System.out.println(firstNation + " " + firstStudㄷnt);
			System.out.println(secondNation + " " + secondStudent);
			System.out.println(threeNation + " " + threeStudent);
			break;
		}
		
	}
    
	// 칠무해
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Double[] arr = new Double[7];
		for(int i = 0; i < 7; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i = 7; i < N; i++) {
			
			double temp = Double.parseDouble(br.readLine());
			
			if(temp < arr[6]) {
				arr[6] = temp;
				Arrays.sort(arr);
			}
		}
		
		for (Double double1 : arr) {
			System.out.printf("%.3f", double1);
			System.out.println();
		}
	}
	
	// 최후의 승자는 누구?
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N;
		int M;
		int i;
		int j;
		int mxcnt;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int[] mx = new int[M];
		int[] cnt = new int[N];
		
		for(i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(j = 0; j < M; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(i = 0; i < N; i++) Arrays.sort(arr[i]);
		
		for(i = 0; i < N; i++) {
			for(j = 0; j < M; j++) mx[j] = Math.max(mx[j], arr[i][j]);
		}
		
		for(i = 0; i < N;i++) {
			for(j = 0; j < M; j++) {
				if(mx[j]==arr[i][j]) cnt[i]++;
			}
		}
		
		mxcnt = 0;
		for(i = 0; i < N; i++) mxcnt = Math.max(mxcnt, cnt[i]); 

		for(i = 0; i < N; i++) {
			if(mxcnt==cnt[i]) sb.append((i+1)+" ");
		}
		System.out.println(sb);
	}
	
	//
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
	}
	
	// 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	}
	
	// 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	}
	
	//
	public static void test09() throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
	}
	
	// 
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
	}
	
	
}
