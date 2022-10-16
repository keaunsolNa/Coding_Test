package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement10 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 별 찍기 - 9
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 2*N-1; i++) {
			if(i <= N) {
				for(int j = 1 ; j <= i - 1; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= 2 * N - 1 - 2  * (i - 1); j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= N - (i % N) - 1; j++) {
					System.out.print(" ");
				}
				
				for(int j = 1; j <= 2 * (i % N) + 1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	
	// Простая задача
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());
			
			if(I > 2 && F > 2) {
				System.out.println("No");
			} else if(I < 2 && F < 3) {
				System.out.println("Yes");
			} else if(I < 3 && F < 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	// 0 = not cute / 1 = cute
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int Q = 0;
		int NQ = 0;
		for(int i = 0; i < T; i++) {
			int answer = Integer.parseInt(br.readLine());
			
			if(answer == 1) {
				Q++;
			} else {
				NQ++;
			}
		}
		
		if(Q > NQ) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
	}
	
	// 알고리즘 수업 - 알고리즘의 수행 시간 2
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(N);
		System.out.println(1);
		
	}
	
	// 나는 요리사다
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int max = 0;
		int winner = 0;
		for(int i = 1; i <= 5; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int sum = 0;
			
			for(int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			if(sum > max) {
				max = sum;
				winner = i;
			}
		}
		
		System.out.println(winner + " " + max);
		
	}
	
	// 윷놀이
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 3; i++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			if(sum == 0) {
				System.out.println("D");
			} else if(sum == 1) {
				System.out.println("C");
			} else if(sum == 2) {
				System.out.println("B");
			} else if(sum == 3) {
				System.out.println("A");
			} else if(sum == 4) {
				System.out.println("E");
			}
		}
	}
	
	// 별 찍기 - 6
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 2*star-1; i++) {
			for(int j = 1 ; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * star - 1 - 2  * (i - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	// 별 찍기 - 7
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int star = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * star - 1; i++) {
            if (i <= star) {
                for (int j = 1; j <= star - i; j++) {
                    sb.append(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                	sb.append("*");
                }
            }
            else {
                for (int j = 1; j <= i % star; j++) {
                	sb.append(" ");
                }
                for (int j = 1; j <= (2 * star - 1) - 2 * (i % star); j++) {
                	sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
	
	// 플러그
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int multitap = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < multitap; i++) {
			sum += Integer.parseInt(br.readLine()) - 1;
		}
		
		System.out.println(sum+1);
	}
	
	// 이진수
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(br.readLine());
			StringBuilder binaryTemp = new StringBuilder(Integer.toBinaryString(temp));
			binaryTemp.reverse();
			
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < binaryTemp.length(); j++) {
				if(binaryTemp.charAt(j) == '1') {
					sb.append(j).append(" ");
				}
			}
			System.out.println(sb);
		}
	}
	
}
