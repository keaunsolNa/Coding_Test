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
	
    static class Condo {
        int d, p;
        public Condo(int d, int p) {
            this.d = d;
            this.p = p;
        }
    }
    
	public static void main(String[] args) throws IOException {
		test10();
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
	
	// 3273번 - 두 수의 합
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int ans = 0;
        int left = 0;
        int right = N - 1;
        
        while(left < right) {
        	
        	int sum = arr[left] + arr[right];
            if(sum == K) {   
                ans++;
                left++;
                right--;
           
            } else if(sum > K) right--;
            
            else left++;
            
        }
		
		System.out.println(ans);
	}
	
	// 18310번 - 안테나
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		System.out.println(arr[(N-1)/2]);
		
	}
	
	// 5648번 - 역원소 정렬 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String input = "";
		List<Long> list = new ArrayList<>();
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			
			while(st.hasMoreTokens()) {
				
				StringBuilder temp = new StringBuilder(st.nextToken()).reverse();
				long value = Long.parseLong(temp.toString());
				list.add(value);
			}
		}
		
		list.remove(0);
		Collections.sort(list);
		
		for (Long long1 : list) {
			System.out.println(long1);
		}
	}
	
	// 2246번 - 콘도 선정
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        Condo[] arr = new Condo[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Condo(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            Condo cur = arr[i];
            boolean chk = true;
            for (int j = 0; j < N; j++) {
            	
                if (i == j) continue;
                if (cur.p>arr[j].p && cur.d>=arr[j].d) {
                    chk = false;
                    break;
                }
                
                if (cur.d>arr[j].d && cur.p>=arr[j].p) {
                    chk = false;
                    break;
                }
                
            }
            if (chk) cnt++;
        }
        System.out.println(cnt);
	}
	
	// 25859번 - Sort by Frequency
	public static void test09() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
		}

		List<Entry<Character, Integer>> list_entries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

		Collections.sort(list_entries, new Comparator<Entry<Character, Integer>>() {
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				if(o1.getValue() == o2.getValue()) {
					return o1.getKey() - o2.getKey();
				}
				else return o2.getValue().compareTo(o1.getValue());
			}
		});

		for (Entry<Character, Integer> entry : list_entries) {
			for(int i = 0; i < entry.getValue(); i++) sb.append(entry.getKey());
		}
		
		System.out.println(sb);
	}
	
	// 2628번 - 종이자르기
	public static void test10() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		boolean[] wa = new boolean[w];
		boolean[] ha = new boolean[h];

		int n = Integer.parseInt(bf.readLine());

		while (n > 0) {
			st = new StringTokenizer(bf.readLine());
			int wh = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());

			if (wh == 0) ha[idx] = true;
			if (wh == 1) wa[idx] = true;
			n--;
		}

		int mw = 0;
		int tmp = 0;
		for (int i = 0; i < wa.length; i++) {
			
			if (wa[i]) {
				
				mw = Math.max(mw, tmp);
				tmp = 1;
				
			} else tmp++;
		}
		
		mw = Math.max(mw, tmp);

		tmp = 0;
		int mh = 0;
		for (int i = 0; i < ha.length; i++) {
			
			if (ha[i]) {
				
				mh = Math.max(mh, tmp);
				tmp = 1;
				
			} else tmp++;
		}
		
		mh = Math.max(mh, tmp);

		System.out.println(mw * mh);
	}
	
	
}
