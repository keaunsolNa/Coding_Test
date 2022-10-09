package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Sort01 {
	
	public static void main(String[] args) throws IOException {
		test10();
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
	
	// N번째 큰 수
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());  
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < testCase; i++) {
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr);  
            sb.append(arr[7] + "\n");  
        }
        System.out.print(sb);
	}
	
	// 問題1
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				if(Integer.parseInt(st.nextToken()) == 1) {
					num[j]++;
				}
			}
		}
		
		int max = n;
		StringBuilder sb = new StringBuilder();
		while(max != 0) {
			for(int i = 0; i < m; i++) {
				if(max == num[i]) {
					sb.append(i + 1).append(" ");
				}
			}
			max--;
		}
		System.out.print(sb);
		
	}
	
	// 일곱 난쟁이
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		for(int i = 0; i < 8; i++) {
			for(int j = i+1; j < 9; j++) {
				
				if(sum - arr[i] - arr[j] == 100) {
					arr[i] = 0; 
					arr[j] = 0;
					Arrays.sort(arr);
					
					for(int k = 2; k < arr.length; k++) {
						System.out.println(arr[k]);
					}
					return;
				}
			}
		}
	}
	
	// Presents 
	public static void test09() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[T];
		double[] originArr = new double[T];
		for(int i = 0; i < T; i++) {
			originArr[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(originArr);
		
		String sb = originArr[1]+"";
		
		if(sb.split("[.]")[1].length() == 1) {
			System.out.println(sb+"0");
		} else {
			System.out.println(sb);
		}
		
	}
	
	// Number Maximization
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] strArr = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
			strArr[i] = str.charAt(i)+"";
		}
		
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.parseInt(o2) - Integer.parseInt(o1);
			}
		});

		for (String string : strArr) {
			System.out.print(string);
		}
	}
}
