package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Implement58 {
    
	public static void main(String[] args) throws IOException {
		test10();
	}

	
	// 28235번 - 코드마스터 2023
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		switch(input) {
		
			case "SONGDO" : System.out.println("HIGHSCHOOL"); break;
			case "CODE" : System.out.println("MASTER"); break;
			case "2023" : System.out.println("0611"); break;
			case "ALGORITHM" : System.out.println("CONTEST"); break;
			
		}
		
	}
	
	// 3778번 - 애너그램 거리
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			String input1 = br.readLine();
			int[] alp1 = new int[26];
			for(int j = 0; j < input1.length(); j++) alp1[input1.charAt(j) -'a']++;
			
			String input2 = br.readLine();
			int[] alp2 = new int[26];
			for(int j = 0; j < input2.length(); j++) alp2[input2.charAt(j) -'a']++;
			
			int total = 0;
			for(int j = 0; j < 26; j++ ) total += Math.abs(alp1[j] - alp2[j]);
			
			System.out.println("Case #" + (i + 1) + ": " + total);
		}
	}
	
	// 27621번 - Sum of Three Cubes
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[][] a = {
		     {0, 0, 0},
		     {0, 0, 1},
		     {0, 1, 1},
		     {1, 1, 1},
		     {0},
		     {0},
		     {-1, -1, 2},
		     {0, -1, 2},
		     {0, 0, 2},
		     {0, 1, 2},
		     {1, 1, 2},
		     {-2, -2, 3},
		     {7, 10, -11},
		     {0},
		     {0},
		     {-1, 2, 2},
		     {-511, -1609, 1626},
		     {1, 2, 2},
		     {-1, -2, 3},
		     {0, -2, 3},
		     {1, -2, 3},
		     {-11, -14, 16},
		     {0},
		     {0},
		     {-2901096694L, -15550555555L, 15584139827L},
		     {-1, -1, 3},
		     {0, -1, 3},
		     {0, 0, 3},
		     {0, 1, 3},
		     {1, 1, 3},
		     {-283059965, -2218888517L, 2220422932L},
		     {0},
		     {0},
		     {8866128975287528L, -8778405442862239L, -2736111468807040L},
		     {-1, 2, 3},
		     {0, 2, 3},
		     {1, 2, 3},
		     {0, -3, 4},
		     {1, -3, 4},
		     {117367, 134476, -159380},
		     {0},
		     {0},
		     {-80538738812075974L, 80435758145817515L, 12602123297335631L},
		     {2, 2, 3},
		     {-5, -7, 8},
		     {2, -3, 4},
		     {-2, 3, 3},
		     {6, 7, -8},
		     {-23, -26, 31},
		     {0},
		};
				 
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a[N].length; i++) sb.append(a[N][i] + " ");
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
		
	}
	
	// 18309번 - Extreme Temperatures
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String input = "";
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			String day = st.nextToken();
			
			while(st.hasMoreTokens()) {
				
				int temp = Integer.parseInt(st.nextToken());
				min = Math.min(min, temp);
				max = Math.max(max, temp);
				
			}
			
		}
		System.out.println(min + " " + max);
	}
	
	// 9806번 - The King
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int ans = 0;
		int[] s = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			s[i] = temp;
		}
		
		if(A % 2 != 0) {
			
			for(int i = 0; i < N; i++) {
				if(s[i] > 0) ans += Math.pow(s[i], A);
			}
		}
		
		else  {
			for(int i = 0; i < N; i++) ans += Math.pow(s[i], A);
		}
		
		System.out.println(ans);
	}
		
	// 19786번 - Ставка
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int R = A * (((r + 1) * (r + 1)) + (g * g) + (b * b)) + C *(Math.min(r + 1, Math.min(g, b)));
			int G = A * ((r * r) + ((g + 1) * (g + 1)) + (b * b)) + C *(Math.min(r, Math.min(g + 1, b)));
			int B = A * ((r * r) + (g * g) + ((b + 1) * (b + 1))) + C *(Math.min(r, Math.min(g, b + 1)));
			
			if(Math.max(R, Math.max(G, B)) == R) System.out.println("RED");
			else if(Math.max(R, Math.max(G, B)) == B) System.out.println("BLUE");
			else System.out.println("GREEN");
		}
		
	}
	
	// 1392번 - 노래 악보
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			int t = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < t; j++) list.add(i);
		}
		
		for(int i = 0; i < Q; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(list.get(num)).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// 28225번 - Flower Festival
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		double min = Integer.MAX_VALUE;
		int winner = 0;
		
		for(int i = 1; i <= n; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			double v = Integer.parseInt(st.nextToken());
			
			double rest = f - x;
			
			double time = rest / v ;
			
			if(time < min) {
				min = time;
				winner = i;
			}
		}
		
		System.out.println(winner);
		
	}
	
	// 11285번 - 초성 중성 종성 2
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
		String[] second = {"ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
		String[] third = {"", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };
		
		String s1 = br.readLine().trim();
		String s2 = br.readLine().trim();
		String s3 = br.readLine().trim();
		
		int n = 44032;
		
		for (int i = 0; i < first.length; i++) {
            if (s1.equals(first[i])) {
                n += (i * 21 * 28);
                break;
            }
        }

        for (int i = 0; i < second.length; i++) {
            if (s2.equals(second[i])) {
                n += i * 28;
                break;
            }
        }

        for (int i = 0; i < third.length; i++) {
            if (s3.equals(third[i])) {
                n += i;
                break;
            }
        }

        System.out.println((char)n);
		
	}
	
	// 13877번 - 이건 무슨 진법이지?
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            char[] N = st.nextToken().toCharArray();

            int o = findMaxDigit(N) < '8' ? Integer.parseInt(String.valueOf(N), 8) : 0;

            System.out.println(K + " " + o + " " + Integer.parseInt(String.valueOf(N)) + " " + Integer.parseInt(String.valueOf(N), 16));
      
		}
	}
	
	private static char findMaxDigit(char[] arr) {
        char max = '0';
        
        for (char c : arr)
            if (c > max) max = c;
        
        return max;
    }
	
	
}
