package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Implement15 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Celebrity jeopardy
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while((input = br.readLine()) != null) {
			System.out.println(input);
		}
	}
	
	// Find the Twins 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			
			String input = br.readLine();
			
			if(input.contains("18") && input.contains("17")) {
				System.out.println(input);
				System.out.println("both");
			} else if(input.contains("18")) {
				System.out.println(input);
				System.out.println("mack");
			} else if(input.contains("17")) {
				System.out.println(input);
				System.out.println("zack");
			} else {
				System.out.println(input);
				System.out.println("none");
			}
			System.out.println();
		}
	}
	
	// Intercepting Information
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int maxScore = 0;
		int recordC = 0;
		int recordL = 0;
		int winner = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
			if(S > maxScore) {
				maxScore = S;
				recordC = C;
				recordL = L;
				winner = i+1;
			} else if(S == maxScore) {
				if(C < recordC) {
					recordC = C;
					recordL = L;
					winner = i + 1;
				} else if(C == recordC) {
					if(L < recordL) {
						recordL = L;
						winner = i + 1;
					}
				}
			}
		}
		
		System.out.println(winner);
	}
	
	// 과자 사기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double max = 0;
		String winner = "";
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			double price = Integer.parseInt(st.nextToken());
			double weight = Integer.parseInt(st.nextToken());
			double pricePerformanceRatio = 0;
			
			if(price*10 >= 5000) {
				pricePerformanceRatio = ((weight*10) / (price*10 - 500));
			} else {
				pricePerformanceRatio = (weight*10) / (price*10);
			}
			
			if(pricePerformanceRatio > max) {
				max = pricePerformanceRatio;
				switch(i) {
					case 0 : winner = "S"; break;
					case 1 : winner = "N"; break;
					case 2 : winner = "U"; break;
				}
			}
			
		}
		
		System.out.println(winner);
	}
	
	// 집 주소
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while(!(input = br.readLine()).equals("0")) {
			int totalD = 0;
			totalD += input.length() - 1;
			totalD += 2;
			
			long zeroCount = input.chars()
	                .filter(c -> c == '0')
	                .count();
			
			long oneCount = input.chars()
	                .filter(c -> c == '1')
	                .count();
			
			totalD += zeroCount*4;
			totalD += oneCount*2;
			
			totalD += (input.length() - zeroCount - oneCount) * 3;
			System.out.println(totalD);
		}
	}
	
	// 심준의 병역판정검사
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st; 
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			double height = Double.parseDouble(st.nextToken());
			double weight = Double.parseDouble(st.nextToken());
			double bmi = weight/(height*height/10000);
			
			if(height < 140.1) {
				
				System.out.println(6);
				
			} else if(height < 146) {
				
				System.out.println(5);
				
			} else if(height < 159) {
				
				System.out.println(4);
				
			} else if(height < 161) {
				
				if(bmi >= 16 && bmi < 35){
                    System.out.println(3);
                }else{
                    System.out.println(4);
                }
				
			} else if(height < 204) {
				
				 if(bmi >= 20 && bmi < 25){
					 
                    System.out.println(1);
                    
                }else if(bmi >= 18.5 && bmi < 20){
                	
                    System.out.println(2);
                    
                }else if(bmi >= 25 && bmi < 30){
                	
                    System.out.println(2);
                    
                }else if(bmi >= 16 && bmi < 18.5){
                	
                    System.out.println(3);
                    
                }else if(bmi >= 30 && bmi < 35){
                	
                	System.out.println(3);
                	
                }else{
                	
                    System.out.println(4);
                    
                }
				 
			} else {
				
				System.out.println(4);
				
			}
			
		}
		
		
	}
	
	// 미션 도네이션
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			int[][] mission = new int[M][3];
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				mission[j][0] = Integer.parseInt(st.nextToken());
				mission[j][1] = Integer.parseInt(st.nextToken());
				mission[j][2] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			
			BigInteger totalMoney = new BigInteger("0");
			for(int j = 0; j < M; j++) {
				double temp = (mission[j][0] * K) - (mission[j][1] * D) + (mission[j][2] * A);
				
				if(temp > 0) {
					BigInteger money = new BigInteger((temp+"").split("[.]")[0]);
					totalMoney = totalMoney.add(money);
				}
			}
			
			System.out.println(totalMoney);
		}
		
		
	}
	
	// RICE SACK 
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int max = 0;
        	for(int j = 0; j < 5; j++) {
        		int temp = Integer.parseInt(st.nextToken());
        		if(temp > max) max = temp;
        	}
        	
        	System.out.println("Case #" + (i+1) + ": " + max);
        }
        
	}
	
	// More Dice
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= T; i++) {
        	
            int cur = Integer.parseInt(br.readLine());
            sb.append(String.format("Case %d:\n", i));
            
            for (int a = 1; a <= 6; a++) {
            	
                for (int b = a; b <= 6; b++) {
                	
                    if (a+b == cur) {
                        sb.append(String.format("(%d,%d)\n", a, b));
                    }
                }
            }
        }
        System.out.println(sb);
        
	}
	
	// Hot Dogs
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input, " ");
			double H = Integer.parseInt(st.nextToken());
			double P = Integer.parseInt(st.nextToken());
			double answer = Math.round(H/P * 100) / 100.0;
			System.out.printf("%.2f", answer);
			System.out.println();
		}
	}
	
	
}
