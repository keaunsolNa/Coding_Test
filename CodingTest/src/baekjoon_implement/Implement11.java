package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement11 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 별 찍기 - 8
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 2*N-1; i++) {
			if(i <= N) {
				for(int j = 1 ; j <= i; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= 2 * N - 2  * i; j++) {
					System.out.print(" ");
				}
				for(int j = 1 ; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= N - (i % N); j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= 2 * (i % N); j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= N - (i % N); j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	
	// 공
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ball = 1;
		
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			int one = Integer.parseInt(temp[0]);
			int two = Integer.parseInt(temp[1]);
			if(ball == one) {
				ball = two;
			} else if(ball == two) {
				ball = one;
			}
		}
		
		System.out.println(ball);
	}
	
	// 이게 분수?
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		double c = Integer.parseInt(st.nextToken());
		double d = Integer.parseInt(st.nextToken());

        double[] arr = {
                ((double)a / c) + ((double)b / d),
                ((double)c / d) + ((double)a / b),
                ((double)d / b) + ((double)c / a),
                ((double)b / a) + ((double)d / c)
        };
 
        double max = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(index);
	}
	
	// 완전 세제곱
	public static void test04() throws IOException {
		
		StringBuilder sb = new StringBuilder();
		
		for(int a = 2; a <= 100; a++) {
			
			for(int b = 2; b <= a; b++) {
				
				for(int c = b; c <= a; c++) {
					
					for(int d = c; d <= a; d++) {
						
						if(a*a*a == b*b*b + c*c*c + d*d*d) {
							
							sb.append("Cube = ").append(a).append(", Triple = (").append(b);
							sb.append(",").append(c).append(",").append(d).append(")").append("\n");
							
						}
					}
				}
			}
		}
		System.out.println(sb);
		
	}
	
	// 계산기 프로그램
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		
		String operator = "";
		int sum = Integer.parseInt(br.readLine());
		int num;
		while(!(input = br.readLine()).equals("=")) {
			try {
				
				num = Integer.parseInt(input);
				
				switch(operator){
				
					case "+" : sum += num; break;
					case "-" : sum -= num; break;
					case "*" : sum *= num; break;
					case "/" : sum /= num; break;
					
				}
				
			} catch(java.lang.NumberFormatException e) {

				operator = input;
				
			}
		}
		System.out.println(sum);
		
	}
	
	// 별찍기 - 13
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 2*star - 1; i++) {

			if(i < star) {
				
				for(int j = i+1; j > 0; j--) {
					System.out.print("*");
				}
				
			} else {
				
				for(int j = i; j < 2*star - 1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
		}
	}
	
	// 주사위 게임
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			int c = Integer.parseInt(temp[2]);
			
			if(a == b && b == c) {
				sum += (10000 + (a*1000));
			} else if(a != b && a != c && b != c) {
				sum += Math.max(Math.max(a, b), c)*100;
			} else {
				if(a == b) {
					sum += 1000 + a*100;
				} else if (a == c) {
					sum += 1000 + a*100;
				} else if (b == c) {
					sum += 1000 + b*100;
				}
			}
			
			if(max < sum) {
				max = sum;
			}
			sum = 0;
		}
		
		System.out.println(max);
	}
	
	// ABC
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int array[] = new int[3];
        array[0] = Integer.parseInt(temp[0]);
        array[1] = Integer.parseInt(temp[1]);
        array[2] = Integer.parseInt(temp[2]);
        
        Arrays.sort(array);
        
        String ABC = br.readLine();

        for(int i = 0; i < 3; i++) {
        	char c = ABC.charAt(i);
        	
        	if(c == 'A') {
        		System.out.print(array[0] + " ");
        	} else if(c == 'B') {
        		System.out.print(array[1] + " ");
        	} else if(c == 'C') {
        		System.out.print(array[2] + " ");
        	}
        }
	}
	
	// 별찍기 - 12
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= star; i++) {
        	
            for (int j = star - i; j > 0; j--) {
            	System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
            	System.out.print("*");
            }
            
            System.out.println();
            
        }
        
        for (int i = 1; i <= star-1; i++) {
        	
            for (int j = 1; j <= i; j++) {
            	System.out.print(" ");
            }
            
            for (int j = 1; j <= star-i; j++) {
            	System.out.print("*");
            }
            
            System.out.println();
            
        }
		
	}
	
	// 별찍기 - 15
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < star; i++) {
			
			for (int j = star - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");
			}
			
			if (i > 0)
				System.out.print("*");

			System.out.println("");
		}
	}
	
}
