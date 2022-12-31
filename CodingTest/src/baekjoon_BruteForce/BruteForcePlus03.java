package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BruteForcePlus03 {
	
   public static void main(String[] args) throws IOException {
      test10();
   }
	
	// 회의실 배정
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] time = new int[N][2];
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken());	
			time[i][1] = Integer.parseInt(st.nextToken());	
		}
		
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) return o1[0] - o2[0];
				
				return o1[1] - o2[1];
			}
 
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

	// 뒤집기
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		char start = input.charAt(0);
		int cnt = 0;
		for(int i = 1; i < input.length(); i++) {
			
			if(input.charAt(i) != start) {
				start = input.charAt(i);
				cnt++;
			}
		}
		
		System.out.println((cnt + 1)/2);
	}
	
	// 이장님 초대 
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr, Collections.reverseOrder());
		
		int cnt = 2;
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			min = Math.max(min, cnt + arr[i]);
			cnt++;
		}
		
		System.out.println(min);
	}
	
	// 로프
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < N; i++) max = Math.max(max, arr[i] * (N - i));
		
		System.out.println(max);
	}

	// 30 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
        int[] numCount = new int[10];
        long total = 0;
        
        for(int i = 0; i < input.length(); i++) {
            int temp = Integer.parseInt(input.substring(i, i+1));
            numCount[temp] += 1;
            total += temp;
        }
        
        
        if(!input.contains("0") || total % 3 != 0) {
        	System.out.println(-1);
        	return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(numCount[i] > 0) {
                sb.append(i);
                numCount[i]--;
            }
        }
		
        System.out.println(sb.toString());
		
	}

	// 주유소 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] length = new long[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N - 1; i++) length[i] = Integer.parseInt(st.nextToken());
			
		long[] pay = new long[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) pay[i] = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		long minPay = pay[0];
		
		for(int i = 0; i < N - 1; i++) {
			
			if(pay[i] < minPay) minPay = pay[i];
			
			sum += (minPay * length[i]);
		}
		
		System.out.println(sum);
	}

	// 캠핑
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		int idx = 1;
		
		while(!(input = br.readLine()).equals("0 0 0")) {
			StringTokenizer st = new StringTokenizer(input);
			
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			sb.append("Case ").append(idx).append(": ").append(L * (V/P) + Math.min(L, (V % P))).append("\n");
			idx++;
		}
		
		System.out.println(sb);
	}
	
	// 귀찮음
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		long total = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}
		
		long ans = 0;
		for(int i = 0 ; i < n; i++) {
			long temp = arr[i];
			total -= temp;
			ans += temp * total;
		}
		
		System.out.println(ans);
	}
	
	// 짐 챙기는 숌
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] book = new int[N];
		if(N == 0) {
			System.out.println(0);
			return;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) book[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int cnt = 1;
		for(int i = 0; i < N; i++) {
			
			sum += book[i];
			
			if(sum > M) {
				cnt++;
				sum = book[i];
			}
		}
		
		
		System.out.println(cnt);
	}
	
	// 알바생 강호
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		for(int i = 0; i < N; i++)arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		long sum = 0;
		for(int i = 0; i < N; i++) {
			if(arr[i] - i > 0) {
				sum += arr[i] - i;
			} else break;
		}

		System.out.println(sum);
	}

}

