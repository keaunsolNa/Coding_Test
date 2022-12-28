package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Implement21 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 대회 자리
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			Map<Integer, Boolean> map = new HashMap<>();
			int P = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] arr = new int[P];
			for(int i = 0; i < P; i++) arr[i] = Integer.parseInt(br.readLine());
			for(int i = 1; i <= M; i++) map.put(i, false);
			
			int cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				if(map.get(arr[i]) == false) map.put(arr[i], true);
				else cnt++;
			}
				
			System.out.println(cnt);
		}
	}
	
	// 생일 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Map<java.util.Date, String> map = new TreeMap<>();
		for(int i = 0; i < N; i++) {
			
			String[] input = br.readLine().split(" ");
			
			String name = input[0];
			String date = "";
			int dd = Integer.parseInt(input[1]);
			int mm = Integer.parseInt(input[2]);
			int yyyy = Integer.parseInt(input[3]);
			
			date += yyyy;
			if(mm < 10) date += "0" + mm;
			else date += "" + mm;
			
			if(dd < 10) date += "0" + mm;
			else date += "" + dd;
			
			SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
			try {
				Date formatDate = dtFormat.parse(date);
				map.put(formatDate, name);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		}
		
		int idx = 1;
		
		for (java.util.Date key : map.keySet()) {
			
			if(idx == 1) sb.append(map.get(key));
			else if(idx == map.size()) sb.insert(0, map.get(key) + "\n");
			
			idx++;
		}
		
		System.out.print(sb);
	}
	
	// 별 찍기 - 20
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			if(i % 2 != 0) System.out.print(" ");
			for(int j = 0; j < N; j++) System.out.print("* ");
			System.out.println();
		}
	}
	
	// No Brainer
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A >= B) System.out.println("MMM BRAINS");
			else System.out.println("NO BRAINS");
		}
		
	}
	
	// 타노스
	public static void test05() throws IOException {
		System.out.println(1);
	}
	
	// 숫자
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
        if(B>A) {
            System.out.println(B -A -1);
            for(long i = A + 1; i < B; i++) System.out.print(i+" ");
        }
        else if(A > B) {
            System.out.println(A - B - 1);
            for(long i = B + 1; i < A; i++) System.out.print(i+" ");
        }
        else System.out.print(0);
	}
	
	// Time to Decompress 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int number = Integer.parseInt(st.nextToken());
			String message = st.nextToken();
			
			for(int i = 0; i < number; i++) sb.append(message);
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// 가장 쉬운 문제를 찾는 문제
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
     
        int minL = Integer.MAX_VALUE;
        String answer = "";
        for(int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	String qs = st.nextToken();
        	int level = Integer.parseInt(st.nextToken());
        	if(level < minL) {
        		minL = level;
        		answer = qs;
        	}
        }
        
        System.out.println(answer);
        
	}
	
	// Buffoon 
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int cal = Integer.parseInt(br.readLine());
        N--;
        while(N -- > 0) {
        	int input = Integer.parseInt(br.readLine());
        	
        	if(cal < input) {
        		System.out.println("N");
        		return;
        	}
        }
        
        System.out.println("S");
        
	}
	
	// 나무 조각 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		while(true) {
			
			if(arr[0] > arr[1]) {
				int temp = arr[1];
				arr[1] = arr[0];
				arr[0] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
			}
			
			if(arr[1] > arr[2]) {
				int temp = arr[2];
				arr[2] = arr[1];
				arr[1] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
				
			}

			if(arr[2] > arr[3]) {
				int temp = arr[3];
				arr[3] = arr[2];
				arr[2] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
				
			}
			
			if(arr[3] > arr[4]) {
				int temp = arr[4];
				arr[4] = arr[3];
				arr[3] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
				
			}
			
			
			if(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3] && arr[3] < arr[4]) break;
		}
		
	}
	
}
