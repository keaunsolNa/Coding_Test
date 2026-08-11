package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Sort03 {
	
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 단어 퍼즐
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int idx = 1;
		while(!(input = br.readLine()).equals("END")) {
			String compare = br.readLine();
			String result = "";
			StringBuilder sb = new StringBuilder();
			if(input.length() != compare.length()) {
				result = "different";
			} else {
		        input = input.chars()       
		                	 .sorted()
		                	 .collect(StringBuilder::new,
		                	 	 	  StringBuilder::appendCodePoint,
		                	 	 	  StringBuilder::append)
		                	 .toString();
		        
		        compare = compare.chars()
		        			     .sorted()
		        			     .collect(StringBuilder::new,
		        				  	      StringBuilder::appendCodePoint,
		        					      StringBuilder::append)
		        			     .toString();
		        
		        if(input.equals(compare)) {
		        	result = "same";
		        } else {
		        	result = "different";
		        }
			}
			
			sb.append("Case ").append(idx).append(": ").append(result);
			idx++;
			
			System.out.println(sb);
		}
		
	}
	
	
	// 배열 합치기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N + M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = N; i < N+M; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		StringBuilder sb = new StringBuilder();
		for (int i : A) {
			sb.append(i).append(" ");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
	
	
	// 사탕
	public static void test09() throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        for(int k = 0; k  <T; k++){
            st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int box = Integer.parseInt(st.nextToken());
            int boxSize[] = new int [box];
            
            for(int i = 0; i < box; i++) {
                st = new StringTokenizer(br.readLine());
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                boxSize[i] = num1 * num2;
            }

            Arrays.sort(boxSize);
            int answer = 0;
            
            for(int i = box-1; i > -1; i--) {
                answer++;
                candy-= boxSize[i];
                if(candy < 1) {
                    break;
                }
            }


            sb.append(answer);
            sb.append("\n"); 
        }
        
        System.out.println(sb);
	}
	
	
}
