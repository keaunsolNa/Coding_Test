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
		test10();
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
			int firstStudnt = map.get(key1)[1];
			
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
			
			System.out.println(firstNation + " " + firstStudnt);
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
	
	// 알고리즘 수업 - 삽입 정렬 1
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int cnt = 0;
        int target = 0;
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
			int position = i;
            // 자신의 바로 앞에 노드보다 값이 크기 전까지 뒤로 한칸씩 넣어줌 
            while (position > 0 && key < arr[position - 1]) {
            	cnt++;
                arr[position] = arr[position - 1];
                position--;
                
                if(cnt == 7) target = arr[position];
                flag = false;
            }
            if(flag == false) {
            	cnt++;
            	arr[position] = key;
            	
            	if(cnt == 7) target = arr[position];
            	flag = true;
            }
        }
        
        if(cnt <= K) {
        	System.out.println(-1);
        } else {
        	System.out.println(target);
        }
        
        
	}
	
	// 스텔라(STELLA)가 치킨을 선물했어요
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		ArrayList<STELLA> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int clear = Integer.parseInt(st.nextToken());
			int penalty = Integer.parseInt(st.nextToken());
			list.add(new STELLA(clear, penalty));
		}

		Collections.sort(list);
		STELLA fifth = list.get(4);
        int answer = 0;
        
		for(int i = 5; i < list.size(); i++	) {
			
			STELLA now = list.get(i);
            
            if (fifth.clear == now.clear)
                answer++;
            else break;
		}
		
		System.out.println(answer);
	}
	
	static class STELLA implements Comparable<STELLA>{
		int clear, penalty;
		
		public STELLA(int clear, int penalty) {
			this.clear = clear;
			this.penalty = penalty;
		}
		
        @Override
        public int compareTo(STELLA p) {
            return this.clear == p.clear ? this.penalty - p.penalty : p.clear - this.clear;
        }
		
	}
	
	// Complexity
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < input.length(); i++) {
			set.add(input.charAt(i));
		}
		
		if(set.size() > 3) {
			System.out.println(set.size() - 2);
		} else if(set.size() > 2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
	
	// 서든어택 3
	public static void test09() throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[T-1];
        for(int i = 0; i < T-1; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        boolean win = true;
        
        for (int i : arr) {
        	if(target > i) {
        		target += i;
        	} else {
        		win = false;
        		break;
        	}
		}
        
        if(win) {	
        	System.out.print("Yes");
        } else {
        	System.out.print("No");
        }
        		
	}
	
	// 제 2회 IUPC는 잘 개최될 수 있을까?
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		Integer[] pen = new Integer[N];
		for(int i = 0; i < N; i++) {
			pen[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(pen, Comparator.reverseOrder());
		
		int needPen = M * K;
		int idx = 0;
		while(needPen > 0) {
			
			if(idx >= pen.length) break;
			needPen -= pen[idx];
			idx++;
		}
		
		if(needPen > 0) 
			System.out.println("STRESS");
		else 
			System.out.println(idx);
	}
	
	
}
