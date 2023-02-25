package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Implement49 {
   
	private static class Pair {
		int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
	}
    
	private static class Product{
		
		int price;
		boolean chk;
		
		private Product(int price, boolean chk) {
			this.price = price;
			this.chk = chk;
		}
	}
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 10812번 - 바구니 순서 바꾸기 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = i + 1;
		
		while(M -- > 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			int k = Integer.parseInt(st.nextToken()) - 1;
			
			int[] temp = new int[j - i + 1];
			int idx = k;
			
			for(int t = 0; t < temp.length; t++) {
				if(idx > j) idx = i;
				temp[t] = arr[idx];
				idx++;
			}
			
			int t = 0;
			for(int a = i; a <= j; a++) arr[a] = temp[t++];
			
		}
		for (int l : arr) System.out.print(l + " ");
	}
	
	// 14954번 - Happy Number
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		
		boolean happy = false;
		while(true) {
			
			if(N == 1) {
				happy = true;
				break;
			} else if(N == 4 || N == 16 || N == 37 || N == 42 || N == 20) {
				break;
			}

			String temp = N + "";
			int t = 0;
			for(int i = 0; i < temp.length(); i++) 
				t += Math.pow(Character.getNumericValue(temp.charAt(i)), 2);
			
			N = t;
			
		}
		
		if(happy) System.out.println("HAPPY");
		else System.out.println("UNHAPPY");
		
	}
	
	// 21918번 - 전구
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = (Integer.parseInt(st.nextToken()) == 0) ? 0 : 1;
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			switch(a) {
			
				case 1 : arr[b - 1] = c; break;
				
				case 2 : 
					for(int o = b - 1; o <= c - 1; o++) arr[o] = (arr[o] == 0) ? 1 : 0;
					break;
					
				case 3 : 
					for(int o = b - 1; o <= c - 1; o++) arr[o] = 0; break;
					
				case 4 : 
					for(int o = b - 1; o <= c - 1; o++) arr[o] = 1; break;
			}
			
		}
		
		for (int j : arr) System.out.print(j + " ");
	}
	
	// 17296번 - But can you do it in 0.5x A presses?
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		List<Pair> v = new ArrayList<>();
	    
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			
			double t = Double.parseDouble(st.nextToken());

			int x = (int)t;
			int y = 0;

			if (t - x > 0.1) y = 1;
			v.add(new Pair(x, y));
	        
		}
	    
		int ans = v.get(0).x;
	    
		if (v.get(0).y == 1) ans++;
	        

		for (int i = 1; i < n; i++) {
	    
			if (v.get(i).y == 1 && ans == 0) ans++;
			ans += v.get(i).x;
	        
		}
	    
		System.out.println(ans);
	}
	
	// 12033번 - 김인천씨의 식료품가게 (Small) 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for(int i = 1; i <= T; i++) {
			List<Product> p = new ArrayList<>();
			
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 2 * N; j++) {
				int price = Integer.parseInt(st.nextToken());
				boolean chk = false;
				
				p.add(new Product(price, chk));
			}
			
			for(int j = 0; j < 2 * N; j++) {

				if(!p.get(j).chk) {
					
					for(int k = j + 1; k < 2 * N; k++) {
						
						if(!p.get(k).chk) {
							
							int tempSale = (int)(p.get(k).price * 0.75);
							
							if(p.get(j).price == tempSale) {
								p.get(k).chk = true;
								break;
							}
							else if(tempSale > p.get(j).price) break;
						}
						
					}
				}
			}
			
			sb.append("Case #" + i +": ");
			for(int j = 0; j < p.size(); j++) {
				
				if(!p.get(j).chk) sb.append(p.get(j).price + " ");
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	// 12034번 - 김인천씨의 식료품가게 (Large) 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for(int i = 1; i <= T; i++) {
			List<Product> p = new ArrayList<>();
			
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 2 * N; j++) {
				int price = Integer.parseInt(st.nextToken());
				boolean chk = false;
				
				p.add(new Product(price, chk));
			}
			
			for(int j = 0; j < 2 * N; j++) {

				if(!p.get(j).chk) {
					
					for(int k = j + 1; k < 2 * N; k++) {
						
						if(!p.get(k).chk) {
							
							int tempSale = (int)(p.get(k).price * 0.75);
							
							if(p.get(j).price == tempSale) {
								p.get(k).chk = true;
								break;
							}
							else if(tempSale > p.get(j).price) break;
						}
						
					}
				}
			}
			
			sb.append("Case #" + i +": ");
			for(int j = 0; j < p.size(); j++) {
				
				if(!p.get(j).chk) sb.append(p.get(j).price + " ");
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	// 10996번 - 별 찍기 - 21 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i++) {
			
			if(i % 2 == 0) sb.append('*');
			else sb.append(' ');
			
		}
		
		sb.append('\n');
 
		for(int i = 0; i < N ; i++) {
			
			if(i % 2 != 0) sb.append('*');
			else sb.append(' ');
			
		}
		
		sb.append('\n');
 
		String str = sb.toString();
		for(int i = 1; i < N ; i++) sb.append(str);
		System.out.println(sb);
		
	}
	
	// 11296번 - 가격
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String[] input = br.readLine().split(" ");
			double price = Double.parseDouble(input[0]);
			char dot = input[1].charAt(0);
			char cupon = input[2].charAt(0);
			char pay = input[3].charAt(0);
			
			switch(dot) {
			
				case 'R' : price *= 0.55; break;
				case 'G' : price *= 0.70; break;
				case 'B' : price *= 0.80; break;
				case 'Y' : price *= 0.85; break;
				case 'O' : price *= 0.90; break;
				case 'W' : price *= 0.95; break;
				
			}
			
			if(cupon == 'C') price *= 0.95;
			
			if(pay == 'C') {
				
				if(price * 100 % 10 < 6) price = Math.floor(price * 10) / 10.0;
				else price = Math.ceil(price * 10) / 10.0;
				
			} 
			
			
			String ans = String.format("%.2f", price);
			sb.append("$" + ans + "\n");
			
		}
		System.out.println(sb);
	}
	
	// 23756번 - 노브 돌리기
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int first = Integer.parseInt(br.readLine());
		
		long total = 0;
		while(N --> 0) {
			
			int target = Integer.parseInt(br.readLine());
			total += Math.min(Math.min(Math.abs(target - first), first + (360 - target)), (360 - first) + target);
			
			first = target;
		}
		
		System.out.println(total);
	}
	
	// 9291번 - 스도쿠 채점
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			
			int[][] map = new int[9][9];
			boolean corectX = true;
			boolean[] corect = new boolean[9];
			String ans = "";
			
			for(int i = 0; i < 9; i++) {
				
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 9; j++) {
					int temp = Integer.parseInt(st.nextToken());
					map[i][j] = temp;
					corect[temp - 1] = true;
				}

				for (boolean b : corect) 
					if(!b) corectX = false;
				
				corect = new boolean[9];
			}
			
			boolean corectY = true;
			if(corectX) {
				
				corect = new boolean[9];
				for(int i = 0; i < 9; i++) {
					
					for(int j = 0; j < 9; j++) corect[map[j][i] - 1] = true;
					
					for (boolean b : corect) 
						if(!b) { corectY = false; break; }
					
					corect = new boolean[9];
				}
				
				if(corectY) {
					
					boolean corectZ = true;
					corect = new boolean[9];
					int sx = 0;
					int sy = 0;
					
					for(int z = 0; z < 3; z++) {
						
						for(int i = 0; i < 3; i++) {
							
							for(int x = sx; x < sx + 3; x++) {
								
								for(int y = sy; y < sy + 3; y++) 
									corect[map[x][y] - 1] = true;
							}
							
							for (boolean b : corect) 
								if(!b) { corectZ = false; break; }
							
							sx += 3;
							corect = new boolean[9];
						}
						
						sy += 3;
						sx = 0;
					}
					
					if(corectZ) ans = "CORRECT";
					else ans = "INCORRECT";
					
				} else ans = "INCORRECT";
				
				
			} else ans = "INCORRECT";
			
			sb.append("Case " + (t + 1) + ": " + ans + "\n");
			if(t < T - 1) br.readLine();
		}
		
		System.out.println(sb);
	}
	
	
	
}
