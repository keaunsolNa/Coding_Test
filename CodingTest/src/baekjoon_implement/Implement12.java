package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement12 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Triangles 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = -1;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			for(int i = 0; i < input; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}
	
	// 주사위
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb  = new StringBuilder();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case " + (i+1) + ": " + + (a+b));
			System.out.println(sb);
		}
	}
	
	// 조교는 새디스트야!!
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		for(int i = 1; i <= T; i++) {
			
			if(i != Integer.parseInt(st.nextToken())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	// J박스 
	public static void test04() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
            for (int j = 0; j < n; j++) {
            	
                for (int k = 0; k < n; k++) {
                	
                    if (j == 0 || j == n - 1 || k == 0 || k == n - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print("J");
                    }
                }
                System.out.println();
            }
            System.out.println();
		}
		
	}
	
	// 더하기 3
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
			
		int sum = 0;
		for(int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		System.out.println(sum);
		
	}
	
	// 네 번째 수
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		if(arr[1] - arr[0] == arr[2] - arr[1]) {
			System.out.println(arr[2] + (arr[1]-arr[0]));
		} else {
			if(arr[1] - arr[0] > arr[2] - arr[1]) {
				System.out.println(arr[0] + arr[2] - arr[1]);
			} else {
				System.out.println(arr[1] + arr[1] - arr[0]);
			} 
		}
	}
	
	// 가위 바위 보?
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int win = 0;
			for(int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String P1 = st.nextToken();
				String P2 = st.nextToken();

				switch(P1) {
					case "P" : 
						win += P2.equals("R") ? 1 : P2.equals("S") ? -1 : 0;
						break;
					case "R" : 
						win += P2.equals("P") ? -1 : P2.equals("S") ? 1 : 0;
						break;
					case "S" : 
						win += P2.equals("P") ? 1 : P2.equals("R") ? -1 : 0;
						break;
				}
				
			}
			
			if(win > 0) {
				System.out.println("Player 1");
			} else if(win == 0) {
				System.out.println("TIE");
			} else {
				System.out.println("Player 2");
			}
		}
	}
	
	// 히스토그램
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int temp = Integer.parseInt(br.readLine());
        	
        	for(int j = 0; j < temp; j++) {
        		System.out.print("=");
        	}
        	System.out.println();
        }
	}
	
	// 최소, 최대 2
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int N = Integer.parseInt(br.readLine());
        	int[] arr = new int[N];
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < N; j++) {
        		arr[j] = Integer.parseInt(st.nextToken());
        	}
        	Arrays.sort(arr);
        	
        	System.out.println(arr[0] + " " + arr[arr.length - 1]);
        }
		
	}
	
	// 맞았는데 왜 틀리죠?
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		String answer = "Accepted";
		
		for(int i = 0; i < S1+S2; i++) {
			st = new StringTokenizer(br.readLine()," ");
			String answer1 = st.nextToken();
			String answer2 = st.nextToken();
			System.out.println("Index : " + i + "\n answer1 : " + answer1 + "\nanswer2 : " + answer2);
			if(i < S1) {
				if(!answer1.equals(answer2)) {
					answer = "Wrong Answer";
					break;
				}
			} else {
				if(!answer1.equals(answer2)) {
					answer = "Why Wrong!!!";
					break;
				}
			}
			System.out.println(answer);
		}
		
		System.out.println(answer);
		
	}
	
}
