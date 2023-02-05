package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement43 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 12759번 - 틱! 택! 토!
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int start = Integer.parseInt(br.readLine());
		
		boolean[][] map1 = new boolean[3][3];
		boolean[][] map2 = new boolean[3][3];

		while(true) {
			String input = br.readLine();
			
			if(input == null) {
				System.out.println(0);
				return;
			}
			
			st = new StringTokenizer(input);
			
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			
			if(start == 1) map1[x][y] = true;
			else map2[x][y] = true;
			
			
			if(check(map1)) {
				System.out.println(1);
				return;
			};
			
			if(check(map2)) {
				System.out.println(2);
				return;
			}
			
			start = (start == 1) ? 0 : 1;
		}
	}
	
	private static boolean check(boolean[][] map) {
		
		if(map[0][0] && map[0][1] && map[0][2]) return true;
		if(map[1][0] && map[1][1] && map[1][2]) return true;
		if(map[2][0] && map[2][1] && map[2][2]) return true;
		if(map[0][0] && map[1][0] && map[2][0]) return true;
		if(map[0][1] && map[1][1] && map[2][1]) return true;
		if(map[0][2] && map[1][2] && map[2][2]) return true;
		if(map[0][2] && map[1][1] && map[2][0]) return true;
		if(map[0][0] && map[1][1] && map[2][2]) return true;
		
		return false;
	}
	
	// 4592번 - 중복을 없애자
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		while(true) {
			
			String input = br.readLine();
			if(input.equals("0")) break;
			
			st = new StringTokenizer(input);
			
			int N = Integer.parseInt(st.nextToken());
			
			int prev = Integer.parseInt(st.nextToken());
			sb.append(prev + " ");
			for(int i = 1; i < N; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				if(prev != temp) sb.append(temp + " ");
				prev = temp;
				
			}
			
			sb.append("$");
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 1431번 - 시리얼 번호
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		String[] input = new String[N];
		for(int i = 0; i < N; i++) input[i] = br.readLine();
		
		Arrays.sort(input, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() != o2.length()) {
					return o1.length() - o2.length();
				} else {
					
					int sum1 = 0;
					int sum2 = 0;

					String temp = o1.replaceAll("[^0-9]", "");
					String temp2 = o2.replaceAll("[^0-9]", "");
					
					for(int i = 0; i < temp.length(); i++) sum1 += Character.getNumericValue(temp.charAt(i));
					for(int i = 0; i < temp2.length(); i++) sum2 += Character.getNumericValue(temp2.charAt(i));
					
					if(sum1 != sum2) return sum1 - sum2;
					
					else return o1.compareTo(o2);
						
				}
			}
 
		});
		
		for (String string : input) sb.append(string + "\n");
		System.out.println(sb);
		
	}
	
	// 12791번 - Starman
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("DavidBowie", 1967);
		map.put("SpaceOddity", 1969);
		map.put("TheManWhoSoldTheWorld", 1970);
		map.put("HunkyDory", 1971);
		map.put("TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars", 1972);
		map.put("AladdinSane", 1973);
		map.put("PinUps", 1973);
		map.put("DiamondDogs", 1974);
		map.put("YoungAmericans", 1975);
		map.put("StationToStation", 1976);
		map.put("Low", 1977);
		map.put("Heroes", 1977);
		map.put("Lodger", 1979);
		map.put("ScaryMonstersAndSuperCreeps", 1980);
		map.put("LetsDance", 1983);
		map.put("Tonight", 1984);
		map.put("NeverLetMeDown", 1987);
		map.put("BlackTieWhiteNoise", 1993);
		map.put("1.Outside", 1995);
		map.put("Earthling", 1997);
		map.put("Hours", 1999);
		map.put("Heathen", 2002);
		map.put("Reality", 2003);
		map.put("TheNextDay", 2013);
		map.put("BlackStar", 2016);
		
		int Q = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < Q; i++) {
			StringBuilder sb2 = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
	
			int cnt = 0;
			for(int j = S; j <= E; j++) {

				for (String key : map.keySet()) {
					if(map.get(key) == j) {
						sb2.append(j + " " + key);
						sb2.append("\n");
						cnt++;
					}
				}
				
			}
			sb.append(cnt + "\n" + sb2);
		
		}
		System.out.println(sb);
	}
	
	// 2526번 - 싸이클
	public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int idx = 0;
        int temp = N;
        int arr[] = new int[P + 1];
        
        while (true) {
        	
        	temp = N * temp % P;
        	for (int i = 0; i < idx; i++) {
        		if (arr[i] == temp) {
        			System.out.println(String.valueOf(idx - i));
        			return;
        		}
        	}

        	arr[idx] = temp;
        	idx++;
        }
	}
	
	// 14467번 - 소가 길을 건너간 이유 1 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		Map<Integer, Integer> cowMap = new HashMap<>();
		
		for(int i = 1;  i <= 10; i ++) cowMap.put(i, 3);
		int cnt = 0;
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			if(cowMap.get(cow) != 3) {
				
				if(cowMap.get(cow) != dir) {
					cowMap.put(cow, dir);
					cnt++;
				}
			} else cowMap.put(cow, dir);
			
		}
		
		System.out.println(cnt);
	}
	
	// 1592번 - 영식이와 친구들
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] cnt = new int[N];
		cnt[0] = 1;
		int target = 0;
		int total = 1;
		
		if(M == 1) {
			System.out.println(0);
			return;
		}
		while(true) {
			
			if(cnt[target] % 2 != 0) {
				if(target + L >= N) target =  ((target + L) - N);
				else target = target + L;
				cnt[target]++;
			} else {
				if(target - L < 0) target = N - (Math.abs(target - L));
				else target = target - L;
				cnt[target]++;
			}
			
			for(int i = 0; i < cnt.length; i++) {
				if(cnt[i] == M) {
					System.out.println(total);
					return;
				};
			}
			total++;
		}
		
	}
	
	// 1668번 - 트로피 진열
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] tropy = new int[N];
		for(int i = 0; i < N; i++) tropy[i] = Integer.parseInt(br.readLine());
		
		int prev = tropy[0];
		int leftSee = 1;
		for(int i = 1; i < N; i++) {
			
			if(prev < tropy[i]) {
				leftSee++;
				prev = tropy[i];
			}
		}
		
		prev = tropy[N - 1];
		int rightSee = 1;
		for(int i = N - 2; i >= 0; i--) {
			
			if(prev < tropy[i]) {
				rightSee++;
				prev = tropy[i];
			}
		}
		
		System.out.println(leftSee);
		System.out.println(rightSee);
		
	}
	
	// 27065번 - 2022년이 아름다웠던 이유
	public static void test09() throws IOException {
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
			
			if(sum < n) System.out.println("BOJ 2022");
			else if(sum == n) System.out.println("BOJ 2022");
			else if(sum > n) {
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
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        switch (a) {
            case 0:
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                break;
            case 1:
                System.out.println("");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                break;
            case 2:
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println(" * * *");
                break;
            case 3:
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                break;
            case 4:
                System.out.println("");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                break;
            case 5:
                System.out.println(" * * *");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                break;
            case 6:
                System.out.println(" * * *");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                break;
            case 7:
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                break;
            case 8:
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                break;
            case 9:
                System.out.println(" * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println(" * * *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println("      *");
                System.out.println(" * * *");
                break;
        }
		
	}
	
	
	
}
