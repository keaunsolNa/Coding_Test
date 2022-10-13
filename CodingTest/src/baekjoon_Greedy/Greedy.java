package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy {
	public static void main(String[] args) throws IOException {
		test03();
	}
	
	// 전자레인지
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int time  = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		if(time%10 != 0) {
			System.out.println(-1);
		} else {
			int a = time/300;
			time = time%300;
			int b = time/60;
			time = time%60;
			int c = time/10;

			System.out.println(a + " " + b + " " + c);
		}
		
	}
	
	//  우유 축제
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N  = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] milk = {0, 1, 2};
		int cnt = 0;
		int answer = 0;
		int index = 0;
		while(true) {
			if (index == N) {
				break;
			}
			int i = Integer.parseInt(st.nextToken());
			
			if(i == milk[cnt]) {
				answer++;
				cnt++;
			}
			
			if(cnt == 3) {
				cnt = 0;
			}
			index++;
			
		}
		
		System.out.println(answer);
	}
	
	// 캥거루 세 마리
	public static void test03() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String[] ABC =  sc.nextLine().split(" ");
			int A = Integer.parseInt(ABC[0]);
			int B = Integer.parseInt(ABC[1]);
			int C = Integer.parseInt(ABC[2]);
				
			if(B - A > C - B) {
				System.out.println(B-A-1);
			} else {
				System.out.println(C-B-1);
			}
		}
	}
}
