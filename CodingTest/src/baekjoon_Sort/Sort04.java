package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Sort04 {
	
	public static void main(String[] args) throws IOException {
		test03();
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

		
	}
    
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
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
