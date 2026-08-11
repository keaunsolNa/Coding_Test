package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Sort01 {
	
	public static void main(String[] args) throws IOException {
		test02();
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
	
}
