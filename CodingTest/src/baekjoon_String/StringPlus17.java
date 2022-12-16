package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus17 {
	
	public static void main(String[] args) throws IOException {
		test07();
	}

	// 문서 검색
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String word = br.readLine();
		
		String[] splict = input.split(word);
		System.out.println((input.length() - input.replaceAll(word, "").length()) / word.length());
	}
	
	// 비밀 이메일
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		int length = input.length;
		int r = 1; 
		int c = 1;
		
        for (int i = 1; i < length; i++) {
            if (length % i == 0 && i <= length / i) {
                r = i;
                c = length / i;
            }
        }
        
        if (r == 0 && c == 0) {
            r = 1;
            c = 1;
        }
		
		int idx = 0;
		char answer[][] = new char[r][c];
		for(int i = 0; i < c; i++) {
			
			for(int j = 0; j < r; j++) {
				answer[j][i] = input[idx++];
			}
		}
		
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(answer[i][j]);
            }
        }
	}

	// 진수 변환기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		if(m == 0) {
			System.out.println(0);
		} else {
			conversion(m, n);
		}
	}
	
    public static void conversion(int number, int N){
        StringBuilder sb = new StringBuilder();
	    int current = number;
	    
        while(current > 0) {
            if(current % N < 10){

            	sb.append(current % N);
                
            } else {
            	
                sb.append((char)(current % N - 10 + 'A'));
                
            }
            current /= N;
        }
        System.out.println(sb.reverse());
    }
    
	// 시간복잡도를 배운 도도
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int C = Integer.parseInt(br.readLine());
		String pattern = "[a-z]";
		
		int max = 0;
		for(int i = 0; i < C; i++) {
			String input = br.readLine();
			input = input.replaceAll("for", "0");
			input = input.replaceAll("while", "0");
			input = input.replaceAll(pattern, "");
			
			if(max < input.length()) {
				max = input.length();
			}
		}
		
		System.out.print(max);
	}
	
	// 단어 시계
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String[] min = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", 
						"thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", 
						"twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", 
						"twenty nine", "half" };
        
		String[] hour = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen"}; 
		
		
		if(m == 0) {
			
			sb.append(hour[h]);
			sb.append(" o' clock");
			
		} else if(m <= 30) {
			sb.append(min[m]);
			
			if(m != 1) {
				if(m != 15 && m != 30 && m!= 45)
				sb.append(" minutes");
			} else {
				if(m != 15 && m != 30 && m!= 45)
				sb.append(" minute");
			}
			sb.append(" past ");
			sb.append(hour[h]);
			
		} else {
			
			m = 60 - m;
			sb.append(min[m]);
			
			if(m != 1) {
				if(m != 15 && m!= 30 && m != 45) {
					sb.append(" minute to ");
				} else {
					sb.append( " to " );
				}
			} else {
				if(m != 15 && m != 30 && m!= 45) {
					sb.append(" minutes to ");
				} else {
					sb.append(" to ");
				}
			}
			
			if(h != 12) {
				sb.append(hour[h + 1]);
			} else {
				sb.append(hour[1]);
			}
			
		}
		
		System.out.println(sb);
	}
	
    // 비트가 넘쳐흘러
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String K = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < K.length(); i++) {
			if(K.charAt(i) == '1') {
				answer++;
			}
		}
		
		System.out.println(answer);
		
    }

	// Java vs C++
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        if(input.contains("_")) {
        	
        	for(int i = 0; i < input.length(); i++) {
        		boolean flag = false;
        		if((int)input.charAt(i) < 95) {
        			sb.setLength(0);
        			sb.append("Error!");
        			break;
        		} else if((int)input.charAt(i) == '_') {
        			i++;
        			flag = true;
        		} else {
        			sb.append(input.charAt(i));
        		}
        		
        		if(flag) {
        			sb.append((char)((int)input.charAt(i) - 32));
        		}
        	}
        	
        } else {
        	
        	for(int i = 0; i < input.length(); i++) {
        		boolean flag = false;
        		
        		if(input.charAt(i) < 95) {
        			sb.append("_");
        			sb.append((char)((int)input.charAt(i) + 32));
        		} else {
        			sb.append(input.charAt(i));
        		}
        		
        	}
        }
        
        System.out.println(sb);
	}
	
    public static long countArrChar(String str, String[] ch) {
    	long temp = 0;
    	
    	for(int i = 0; i < ch.length; i++) {
    		char cr = ch[i].charAt(0);
    		temp += str.chars()
    				.filter(c -> c == cr)
    				.count();
    	}
    	
    	return temp;
    }
	
	// 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	}
	
	// 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	

    // 
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
	}
	
	
}
