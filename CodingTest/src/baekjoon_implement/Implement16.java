package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Implement16 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 신기한 수
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int chk = 0;
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			int j = i;
			sum = 0;
			while (j / 10 > 0) {
				sum = sum + j % 10;
				j = j / 10;
			}
			if (j / 10 == 0) {
				sum = sum + j;
			}
			if (i % sum == 0) chk++;
		}
		
		System.out.println(chk);
		
	}
	
	// 삼각 김밥
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		
		double X = Integer.parseInt(st.nextToken());
		double Y = Integer.parseInt(st.nextToken());
		double price = 1000/Y * X;
		double min = price;

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			double X1 = Integer.parseInt(st.nextToken());
			double Y1 = Integer.parseInt(st.nextToken());
			
			double price2 = 1000/Y1 * X1;
			if(price2 < min) {
				min = price2;
			}
			
		}
		
		System.out.println(Math.round(min * 100)/100.0);
		
	}
	
	// 터널의 입구와 출구
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int now = M;
		int max = M;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int in = Integer.parseInt(st.nextToken());
			int out = Integer.parseInt(st.nextToken());
			
			now += in;
			now -= out;
			
			if(now > max) max = now;
			if(now < 0) break;
			
		}
		
		if(now <0) {
			System.out.println(0);
		} else {
			System.out.println(max);
		}
	}
	
	// 7종 경기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int total = 0;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			
			int pointA = (int)(9.23076 * Math.pow((26.7 - a), 1.835));
			int pointB = (int)(1.84523 * Math.pow((b - 75), 1.348));
			int pointC = (int)(56.0211 * Math.pow((c - 1.5), 1.05));
			int pointD = (int)(4.99087 * Math.pow((42.5 - d), 1.81));
			int pointE = (int)(0.188807 * Math.pow((e - 210), 	1.41));
			int pointF = (int)(15.9803 * Math.pow((f - 3.8), 1.04));
			int pointG = (int)(0.11193 * Math.pow((254 - g), 1.88));
			
			total = pointA + pointB + pointC + pointD + pointE + pointF + pointG; 
			
			System.out.println(total);
		}
	}
	
	// Sort 마스터 배지훈
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1));
	}
	
	// 숫자 맞추기 게임
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long input = -1;
		long index = 1;
		while((input = Integer.parseInt(br.readLine())) != 0) {
			long n = input;
			String evenOrOdd ="";
			
			if(n%2 == 0) {
				evenOrOdd = "even";
				n = (((n * 3) / 2) * 3) / 9;
			} else {
				evenOrOdd = "odd";
				n = ((((n * 3) + 1) / 2) * 3) / 9;
			}
			
			sb.append(index).append(". ").append(evenOrOdd).append(" ").append(n).append("\n");
		
			index++;
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb);
		
	}
	
	// 저항
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, int[]> map = new HashMap<>();
		map.put("black", new int[]{0, 1});
		map.put("brown", new int[]{1, 10});
		map.put("red", new int[]{2, 100});
		map.put("orange", new int[]{3, 1000});
		map.put("yellow", new int[]{4, 10000});
		map.put("green", new int[]{5, 100000});
		map.put("blue", new int[]{6, 1000000});
		map.put("violet", new int[]{7, 10000000});
		map.put("grey", new int[]{8, 100000000});
		map.put("white", new int[]{9, 1000000000});
		
		String color1 = br.readLine();
		String color2 = br.readLine();
		String color3 = br.readLine();
		long value = Long.parseLong(map.get(color1)[0] + "" + map.get(color2)[0]);
		System.out.println(value * map.get(color3)[1]);
		
	}
	
	// 만취한 상범
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int n = Integer.parseInt(br.readLine());
        	Map<Integer, String> map = new HashMap<>();
        	
        	for(int j = 1; j <= n; j++) {
        		map.put(j, "open");
        	}
        	
        	int idx = 1;
        	int row = 2;
        	while(row <= n) {
        		
        		while(row*idx <= n) {
	        		if(map.get(row*idx).equals("open")) {
	        			map.put(row*idx, "close");
	        		} else {
	        			map.put(row*idx, "open");
	        		}
	        		idx++;
        		}
        		row++;
        		idx = 1;
        	}
        	
        	int cnt = 0;
        	for (int roomNumber : map.keySet()) {
				if(map.get(roomNumber).equals("open")) {
					cnt++;
				}
			}
        	
        	System.out.println(cnt);
        }
        
	}
	
	// 캔디
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        double num = Math.pow(10, K);
		int ans = (int) ((int)Math.round(C/num)*num);
		
		System.out.println(ans);
		
	}
	
	// 나의 학점은?
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<Integer, Integer> map = new LinkedHashMap<>();
		int idx = 1;
		
		while(idx != 51) {
			map.put(Integer.parseInt(st.nextToken()), idx);
			idx++;
		}
		
		int getPoint = Integer.parseInt(br.readLine());
		int grade = map.get(getPoint);
		
		if(grade < 6) {
			System.out.println("A+");
		} else if(grade < 16) {
			System.out.println("A0");
		} else if(grade < 31) {
			System.out.println("B+");
		} else if(grade < 36) {
			System.out.println("B0");
		} else if(grade < 46) {
			System.out.println("C+");
		} else if(grade < 49) {
			System.out.println("C0");
		} else if(grade < 51) {
			System.out.println("F");
		}
		
	}
	
	
}
