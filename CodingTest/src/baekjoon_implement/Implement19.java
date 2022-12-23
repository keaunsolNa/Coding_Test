package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Implement19 {

	public static void main(String[] args) throws IOException {
		test03();
	}
	
	// 아이 러브 크로아티아 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int totalTime = 210;
		
		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			int time = Integer.parseInt(input.split(" ")[0]);
			String TNP = input.split(" ")[1];
			totalTime -= time;
			
			if(totalTime < 0) break;
			
			if(TNP.equals("T")) {
				
				if(number < 8) number++;
				else number = 1;
				
			}
			
		}
		
		System.out.println(number);
		
	}
	
	//  Baseball
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int y = 0;
			int k = 0;
			for(int i = 0; i < 9; i++) {
				
				String input = br.readLine();
				
				y += Integer.parseInt(input.split(" ")[0]);
				k += Integer.parseInt(input.split(" ")[1]);
			}
			
			if(y > k) {
				System.out.println("Yonsei");
			} else if(y < k) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
			
		}
	}
	
	// Big Number
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String zero = "0000 \n0  0 \n0  0 \n0  0 \n0000 \n";
		String one = "   1 \n   1 \n   1 \n   1 \n   1 \n";
		String two = "2222 \n   2 \n2222 \n2    \n2222 \n";
		String three = "3333 \n   3 \n3333 \n   3 \n3333 \n";
		String four ="4  4 \n4  4 \n4444 \n   4 \n   4 \n";
		String five = "5555 \n5    \n5555 \n   5 \n5555 \n";
		String six = "6666 \n6    \n6666 \n6  6 \n6666 \n";
		String seven = "7777 \n   7 \n   7 \n   7 \n   7 \n";
		String eight = "8888 \n8  8 \n8888 \n8  8 \n8888 \n";
		String nine = "9999 \n9  9 \n9999 \n   9 \n   9 \n";
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
			
				case '0' : sb.append(zero); break;
				case '1' : sb.append(one); break;
				case '2' : sb.append(two); break;
				case '3' : sb.append(three); break;
				case '4' : sb.append(four); break;
				case '5' : sb.append(five); break;
				case '6' : sb.append(six); break;
				case '7' : sb.append(seven); break;
				case '8' : sb.append(eight); break;
				case '9' : sb.append(nine); break;
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
		
	}
	
	// 알고리즘 수업 - 알고리즘의 수행 시간 4
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        System.out.println(1L * N * (N - 1) / 2);
        System.out.println(2);
	}
	
	// 소금 폭탄
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		int Ahh = Integer.parseInt(A.split(":")[0]);
		int Amm = Integer.parseInt(A.split(":")[1]);
		int Ass = Integer.parseInt(A.split(":")[2]);

		int Bhh = Integer.parseInt(B.split(":")[0]);
		int Bmm = Integer.parseInt(B.split(":")[1]);
		int Bss = Integer.parseInt(B.split(":")[2]);
		
		int totalA = (Ahh*3600) + (Amm*60) + Ass;
		int totalB = (Bhh*3600) + (Bmm*60) + Bss;
		
		int time = 0;
		if(totalA >= totalB) {
			time = 86400 - totalA + totalB;
		} else {
			time = totalB - totalA;
		}

		String H = time / 60 / 60 + ""; 
		String M = time / 60 % 60 + "";
		String S = time % 60 + "";
		
		if(H.length()==1) {
			H = "0" + H;
		}
		if(M.length()==1) {
			M = "0" + M;
		}
		if(S.length()==1) {
			S = "0" + S;
		}
		
		System.out.print(H + ":" + M + ":" + S);
		
		
		
	}
	
	// 시간과 날짜
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
	        if (time(a, b)) {
	            sb.append("Yes ");
	        } else {
	            sb.append("No ");
	        }

	        if (date(a, b)) {
	            sb.append("Yes\n");
	        } else {
	            sb.append("No\n");
	        }
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb);
		
	}
	
    private static boolean time(int num1, int num2) {
        return (num1 < 24 && num1 >= 0) && (num2 < 60 && num2 >= 0);
    }
    
    private static boolean date(int num1, int num2) {
        boolean isValidDate = false;
        switch (num1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (num2 > 0 && num2 <= 31) {
                    isValidDate = true;
                }
                break;
            case 2:
                if (num2 > 0 && num2 <= 29) {
                    isValidDate = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (num2 > 0 && num2 <= 30) {
                    isValidDate = true;
                }
                break;
            default:
                break;
        }
        return isValidDate;
    }

	// 아름다운 수
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			Set<Character> set = new HashSet<>();
			String num = br.readLine();
			
			for(int i = 0; i < num.length(); i++) {
				set.add(num.charAt(i));
			}
			
			System.out.println(set.size());
		}
	}
	
	// 부재중 전화
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        ArrayList<Boolean> sec = new ArrayList<Boolean>();
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < L; j++) { 
                sec.add(true);
            }
            
            if(i != N-1) { 
                for(int j = 0; j < 5; j++) {   
                    sec.add(false);
                }
            }
        }
        
        int result = 0;
        
        while(result < sec.size())  {
        	
            if(sec.get(result) == false) {
                break;
            }
            result += D;    
        }
	
        System.out.println(result);
	}
	
	// 3대 측정
	public static void test09() throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		int teamMin = sc.nextInt();
		int perMin = sc.nextInt();

		int[] arr = new int[N * 3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int a = arr[i * 3 + 0];
			int b = arr[i * 3 + 1];
			int c = arr[i * 3 + 2];

			if (a + b + c >= teamMin && a >= perMin && b >= perMin && c >= perMin) {
				cnt++;
				sb.append(a + " ");
				sb.append(b + " ");
				sb.append(c + " ");
			}
		}
		System.out.println(cnt + "\n" + sb);
	}
	
	// Football Team
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while((input = br.readLine()) != null) {
			
			for(int i = 0; i < input.length(); i++) {

				switch(input.charAt(i)) {
					case 'i' : sb.append('e'); break;
					case 'e' : sb.append('i'); break;
					case 'I' : sb.append('E'); break;
					case 'E' : sb.append('I'); break;
					default : sb.append(input.charAt(i)); break;
				}
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
	
	
}
