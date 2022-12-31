package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GoodByeBOJ2022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}
	
	// A번 - 2022년이 아름다웠던 이유
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			List<Integer> arr = new ArrayList<>();
			for(int i = 1; i < n; i++) {
				if(n % i == 0) { 
					sum += i;
					arr.add(i);
				}
			}
			
			if(sum < n) {
				System.out.println("BOJ 2022");
			} else if(sum == n) {
				System.out.println("BOJ 2022");
			} else if(sum > n) {
				boolean flag = true;
				for(int i = 0; i < arr.size(); i++) {
					
					int sum2 = 0;
					for(int j = 1; j < arr.get(i); j++) {
						
						if(arr.get(i) % j == 0) sum2 += j;
					}
					
					if(sum2 > arr.get(i)) {
						flag = false;
						break;
					}
				}
				
				if(flag) System.out.println("Good Bye");
				else System.out.println("BOJ 2022");
			}
			
		}
	}
	
	
	// B번 - 나무 블럭 게임
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
}