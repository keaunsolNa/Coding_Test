package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Test04_OneDimensionalArray {
	
	// 최소, 최대
	public static void test01(){
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[arr.length-1]);
		
	}
	
	// 최댓값
	public static void test02() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		int max = -1;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index + 1);
	}
	
	// 나머지
	public static void test03() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Integer> arrSet = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arrSet.add(Integer.parseInt(st.nextToken()) % 42);
		}
		
		br.close();
		
		System.out.println(arrSet.size());
	}
	
	// 평균
	public static void test04()  {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		float[] arr = new float[length];
		float max = -1;
		float avg = 0;
		
		
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			avg +=  (arr[i]/max*100)/length;
		}
		
		System.out.println(avg);
		
	}
	
	// OX 퀴즈
	public static void test05()  {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[length];
		
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextLine();
		}
		
		int score = 0;
		int totalScore = 0;
		
		for(int i = 0; i < arr.length; i++) {
			char[] temp = arr[i].toCharArray();
			
			for(int j = 0; j < temp.length; j++) {
				if(temp[j] == 'O') {
					score++;
					totalScore += score;
				} else if(temp[j] == 'X'){
					score = 0;
				}
			}
			score = 0;
			totalScore = 0;
		}
	}
	
	// 평균은 넘겠지
	public static void test06()  {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] arr;
		
		for(int i = 0; i < testCase; i++) {
			
			int studentCount = sc.nextInt();
			arr = new int[studentCount];
			
			int total = 0;
			
			for(int j = 0; j < studentCount; j++) {
				int temp = sc.nextInt();
				arr[j] = temp;
				total += temp;
			}
			
			double avg = total/studentCount;
			double cnt = 0;
			
			for(int k = 0; k < studentCount; k++) {
				if(arr[k] > avg) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt/studentCount)*100);
		}
		
		
	}
	
	
}

