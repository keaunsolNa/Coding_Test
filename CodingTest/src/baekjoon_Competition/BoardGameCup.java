package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BoardGameCup {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test14();
	}
	
	// A번 - 노 땡스!
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int min = arr[0];
		for(int i = 1; i < N; i++) {
			if(arr[i] - arr[i - 1] != 1) {
				
				sum += min;
				min = arr[i];
				
			}
		}
		
		sum += min;
	
		System.out.println(sum);
	}
	
	// B번 - 할리갈리
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			String fruit = input[0];
			int number = Integer.parseInt(input[1]);
			
			map.put(fruit, map.getOrDefault(fruit, 0) + number);
			
		}
		
		for(String key : map.keySet()) {
			
			if(map.get(key) == 5) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
	}

	// 	C번 - 크레이지 타임
	public static void test03() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		int idx = 1;
		boolean back = false;
		for(int i = 1; i <= T; i++) {
			String[] input = br.readLine().split(" ");
			String card = input[0];
			int time = Integer.parseInt(input[1]);
			
			sb.append(idx + " ");
			if(card.equals("HOURGLASS")) {
				
				if(time == idx) {
					sb.append("NO");
				} else {
					if(!back) back = true;
					else back = false;
				}
			}
			if(time == idx) {
				if(!card.equals("HOURGLASS"))sb.append("YES");
				
			} else {
				sb.append("NO");
			}
			
			
			if(back) {
				if(idx == 1) idx = 12;
				else idx--;
			}else {
				if(idx == 12) idx = 0;
				idx++;
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}

	// D번 - Yacht Dice
	public static void test04() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		String[] dic = br.readLine().split(" ");
		int[] dice = new int[3];
		dice[0] = Integer.parseInt(dic[0]);
		dice[1] = Integer.parseInt(dic[1]);
		dice[2] = Integer.parseInt(dic[2]);

		Arrays.sort(dice);
		
		if(input[10] == 'Y') {
			if(dice[0] == dice[1] && dice[1] == dice[2]) {
				System.out.println(50);
				return;
			}
		} 
		
		if(input[9] == 'Y') {
			if(dice[0] != 1 && dice[0] != dice[1] && dice[0] != dice[2] && dice[1] != dice[2]) {
				System.out.println(30);
				return;
			}
		}
		
		if(input[8] == 'Y') {
			if(dice[2] != 6 && dice[0] != dice[1] && dice[0] != dice[2] && dice[1] != dice[2]) {
				System.out.println(30);
				return;
			}
		}
		
		if(input[11] == 'Y') {
			if(dice[0] == 6) {
				System.out.println(30);
				return;
			}
		}
		
		
	}

	// N번 - 수 나누기 게임
	public static void test14() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int[] point = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken()) ;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = i + 1; j < N; j++) {
				if(i != j) {
					
					if(arr[i] % arr[j] == 0) {
						
						point[i] -= 1;
						point[j] += 1;
						
					} else if(arr[j] % arr[i] == 0) {
						
						point[i] += 1;
						point[j] -= 1;
						
					}
				}
			}
			
		}

		for (int i : point) sb.append(i + " ");
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
		
	}

}
