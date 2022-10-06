package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sort01 {

	public static void main(String[] args) throws IOException {
		test05();
	}
	
	// 세 수 정렬
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
	
	// 세 수 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
	}
	
	// Yangjojang of The Year
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int max = 0;
			String best ="";
			
			for(int j = 0; j < N; j++) {
				
				String[] temp = br.readLine().split(" ");
				
				if(max < Integer.parseInt(temp[1])) {
					max = Integer.parseInt(temp[1]);
					best = temp[0];
				}
			}
			System.out.println(best);
		}
	}
	
	// 콘테스트
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] W = new int[10];
		int[] K = new int[10];
		
		for(int i = 0; i < 10; i++) {
			W[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 10; i++) {
			K[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(W);
		Arrays.sort(K);
		
		int sumW = W[9] + W[8] + W[7];
		int sumK = K[9] + K[8] + K[7];
		
		System.out.println(sumW + " " + sumK);
	}
	
	// 점수 집계
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[5];
			for(int j = 0; j < 5; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			if(arr[3] - arr[1] >= 4) {
				System.out.println("KIN");
			} else {
				System.out.println(arr[1]+arr[2]+arr[3]);
			}
		}
	}
	
}
