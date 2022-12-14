package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Implement17 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 집합
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int bit = 0;
		
		while(N --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int number;
			switch(order) {
				case "add" : 
					number = Integer.parseInt(st.nextToken());
                    bit |= (1 << (number - 1));
					break;
				case "remove" : 
					number = Integer.parseInt(st.nextToken());
					bit = bit & ~(1 << (number - 1));
					break;
				case "check" : 
					number = Integer.parseInt(st.nextToken());
                    sb.append((bit & (1 << (number - 1))) != 0 ? "1\n" : "0\n");
					break;
				case "toggle" : 
					number = Integer.parseInt(st.nextToken());
					bit ^= (1 << (number - 1));
					break;
				case "all" : 
					bit |= (~0);
                    break;
				case "empty" : 
					bit &= 0;
					break;
			}
			
		}
		
		System.out.println(sb);
	}
	
	// Good Coin Denomination 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Denominations: ");
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			
			for(int j = 0; j < arr.length; j++) {
				String input = st.nextToken();
				arr[j] = Integer.parseInt(input);
				
				if(j < arr.length-1) {
					sb.append(input + " ");
				} else {
					sb.append(input);
				}
			}
			
			sb.append("\n");
			
			Arrays.sort(arr);
			boolean chk = true;
			for(int j = 0; j < arr.length - 1; j++) {
				
				if(arr[j]*2 > arr[j+1]) {
					chk = false;
					break;
				}
			}
			
			if(chk) {
				sb.append("Good coin denominations!");
			} else {
				sb.append("Bad coin denominations!");
			}
			
			sb.append("\n");
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb.deleteCharAt(sb.length()-1));
	}
	
	// Fold the Paper Nicely 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		boolean left = true;
		for(int i = 0 ; i < T; i++) {
			sb.append("Data set: ");
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int cnt = Integer.parseInt(st.nextToken());
			sb.append(x + " " + y + " " + cnt).append("\n");
			for(int j = 0; j < cnt; j++) {
				if(x > y) {
					x = x/2;
					left = false;
				} else if(y > x) {
					y = y/2;
					left = true;
				} else if(y == x) {
					if(left) {
						y = y/2;
					} else {
						x = x/2;
					}
				}
				
				if(x == 0 && y == 0) break;
			}
			
			if(x > y) {
				sb.append(x + " " + y).append("\n").append("\n");
			} else {
				sb.append(y + " " + x).append("\n").append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	// 오늘도 졌다
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int A = 0;
		int B = 0;
		boolean win = false;
		for(int i = 0; i < 9; i++) {
			A += Integer.parseInt(st1.nextToken());
			if(A > B) {
				win = true;
				break;
			}
			B += Integer.parseInt(st2.nextToken());
			
		}
		
		if(win) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
	// 3의 배수
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = 0;
		while(input.length() != 1) {
			input = plusStr(input)+"";
			cnt++;
		}
		
		System.out.println(cnt);
		if(Integer.parseInt(input) % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public static int plusStr(String input) {
		
		String[] temp = input.split("");
		int answer = 0;

		for(int i = 0; i < temp.length; i++) {
			answer += Integer.parseInt(temp[i]);
		}
		return answer;
	}
	
	// 🐜 기적의 매매법 🐜
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cash = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] stock = new int[14];
		
		for(int i = 0; i < 14; i++) {
			stock[i] = Integer.parseInt(st.nextToken());
		}
		
		int jAmount = 0;
		int sAmount = 0;
		int jCash = cash;
		int sCash = cash;
		for(int i = 0; i < stock.length; i++) {
			jAmount += jCash/stock[i];
			jCash = jCash%stock[i];
		}
		
		for(int i = 3; i < stock.length; i++) {
			if(stock[i-3] < stock[i-2] && stock[i-2] < stock[i-1] && stock[i-1] < stock[i]) {
				sCash = sAmount*stock[i] + sCash;
				sAmount = 0;
			}
			
			if(stock[i-3] > stock[i-2] && stock[i-2] > stock[i-1] && stock[i-1] > stock[i]) {
				sAmount += sCash/stock[i];
				sCash = sCash%stock[i];
			}
		}
		
		if(jCash + jAmount*stock[13] > sCash + (sAmount*stock[13])) {
			System.out.println("BNP");
		} else if(jCash + jAmount*stock[13] < sCash + (sAmount*stock[13])) {
			System.out.println("TIMING");
		} else {
			System.out.println("SAMESAME");
		}
	}

	// 경매
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int U = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> map = new TreeMap<>();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int price = Integer.parseInt(st.nextToken());
			map.put(price, map.getOrDefault(price, "") + name + " ");
		}
		
		int min = N;
		String winner = "";
		int price = U;
		for (int key : map.keySet()) {
			String[] temp = map.get(key).split(" ");
			
			if(temp.length < min) {
				min = temp.length;
				winner = temp[0];
				price = key;
			} else if(temp.length == min) {
				
				if(price > key) {
					winner = temp[0];
					price = key;
				}
			}
			
		}
		
		System.out.print(winner + " " + price);
		
	}
	
	// 에라토스테네스의 체
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        List<Integer> arrList = new ArrayList<>();
        for(int i = N; i >= 2; i--) {
        	arrList.add(i);
        }
        
        int answer = 0;
        while(!arrList.isEmpty()) {
        	int target = arrList.get(arrList.size()-1);
        	int length = arrList.size();
        	if(length == 0) break;
        	
        	for(int i = arrList.size()-1; i >= 0; i--) {
        		if(arrList.get(i) % target == 0) {
        			K--;
        			if(K==0)answer = arrList.get(i);
        			arrList.remove(i);
        		}
        	}
        	
        }
        System.out.println(answer);
	}
	
	// 수 이어 쓰기 1
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int input = Integer.parseInt(br.readLine());
        int length = 0;
        for(int i = 1; i <= input; i++) {
        	if(i < 10) {
        		length++;
        	} else if(i < 100) {
        		length += 2;
        	} else if(i < 1000) {
        		length += 3;
        	} else if(i < 10000) {
        		length += 4;
        	} else if(i < 100000) {
        		length += 5;
        	} else if(i < 1000000) {
        		length += 6;
        	} else if(i < 10000000) {
        		length += 7;
        	} else if(i < 100000000) {
        		length += 8;
        	} else {
        		length += 9;
        	}
        }
        
        System.out.println(length);
	}
	
	// solved.ac
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] level = new int[N];
		for(int i = 0; i < N; i++) {
			level[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(level);
		
		int percent = (int)Math.round(N*0.15);
		
		int total = 0;
		for(int i = percent; i < level.length-percent; i++) {
			total += level[i];
		}
		
		System.out.println(Math.round((double)total/(N-percent-percent)));
	}
	
	
}
