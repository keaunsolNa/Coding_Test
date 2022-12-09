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
		test10();
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
	
	// 너의 핸들은
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int I = Integer.parseInt(st.nextToken());
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[I-1]);
		
	}
	
	private static long yeonL = 0;
	private static long yeonO = 0;
	private static long yeonV = 0;
	private static long yeonE = 0;
	// 팀 이름 정하기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yendo = br.readLine();
		countYeodoChar(yendo);
		
		int N = Integer.parseInt(br.readLine());
		long maxPoint = -1;
		String winner = "";
		for(int i = 0; i < N; i++) {
			
			String teamName = br.readLine();
			long temp = countChar(teamName);
			
			if(maxPoint < temp) {
				
				winner = teamName;
				maxPoint = temp;

			} else if(maxPoint == temp) {
			
				List<String> sortList = new ArrayList<>();
				
				sortList.add(winner);
				sortList.add(teamName);
				
				Collections.sort(sortList);
				
				winner = sortList.get(0);
			}
			
		}
		
		System.out.println(winner);
		
	}
	
    public static void countYeodoChar(String str) {
    	
    	yeonL = str.chars()
		 		.filter(c -> c == 'L')
		 		.count();
    	yeonO = str.chars()
		 		.filter(c -> c == 'O')
		 		.count(); 
    	yeonV = str.chars()
		 		.filter(c -> c == 'V')
		 		.count(); 
    	yeonE = str.chars()
		 		.filter(c -> c == 'E')
		 		.count();    	
    	
    }
    
    public static long countChar(String str) {
    	
	        long longL = str.chars()
	        		 		.filter(c -> c == 'L')
	        		 		.count() + yeonL;
	        long longO = str.chars()
	        			    .filter(c -> c == 'O')
	        			    .count() + yeonO;
	        long longV = str.chars()
	        				.filter(c -> c == 'V')
	        				.count() + yeonV;
	        long longE = str.chars()
	        				.filter(c -> c == 'E')
	        				.count() + yeonE;
	        
	        return ((longL + longO) * (longL + longV) * (longL + longE) * (longO + longV) * (longO + longE) * (longV + longE)) % 100;
    }
    
	// 카드 바꿔치기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			String[] original = new String[N];
			String[] after = new String[N];
			boolean check = true;
			
			for(int j = 0; j < N; j++) {
				original[j] = st1.nextToken();
				after[j] = st2.nextToken();
			}
			
			Arrays.sort(original);
			Arrays.sort(after);
			
			for(int j = 0; j < N; j++) {
				if(!original[j].equals(after[j])) {
					check = false;
					break;
				}
			}
			
			if(check) {
				System.out.println("NOT CHEATER");
			} else {
				System.out.println("CHEATER");
			}
			
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
	
	// 성적 통계
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < K; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	
        	int N = Integer.parseInt(st.nextToken());
        	StringBuilder sb = new StringBuilder();
        	
        	int min = 101;
        	int max = 0;
        	Integer[] pointArr = new Integer[N];
        	for(int j = 0; j < N; j++) {
        		int point = Integer.parseInt(st.nextToken());
        		pointArr[j] = point;
        		
        		if(point > max) {
        			max = point;
        		}
        		if(point < min) {
        			min = point;
        		}
        	}
        	
        	Arrays.sort(pointArr, Comparator.reverseOrder());
        	
        	int gap = 0;
        	
        	
        	for(int j = 0; j < N-1; j++) {
        		int temp = pointArr[j] - pointArr[j+1];
        		if(gap < temp) gap = temp;
        		
        	}
        	sb.append("Class ").append(i+1).append("\n").append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap);
        	
        	System.out.println(sb);
        }
	}
	
	// 키 큰 사람 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        while(true) {
            int n = Integer.parseInt(br.readLine());
            String[][] str = new String[n][2];

            if(n == 0) {
                break;
            }

            double max = 0;
            
            for(int i = 0; i < n; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            	
                str[i][0] = st.nextToken();
                str[i][1] = st.nextToken();
                max = Double.parseDouble(str[i][1]) > max ? Double.parseDouble(str[i][1]) : max;
            }
            
            String name = "";

            for (int i = 0; i < n; i++) {
                if(Double.parseDouble(str[i][1]) == max) {
                    name += str[i][0] + " ";

                }
            }
            System.out.println(name);
        }
		
	}
	
	// 수 정렬하기 5
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			sb.append(i).append("\n");
		}
		
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
	
	// 세준세비 
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < T; i++) {
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			List<Integer> sejoon = new ArrayList<>();
			List<Integer> sebeee = new ArrayList<>();

			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				sejoon.add(Integer.parseInt(st.nextToken()));
			}
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < M; j++) {
				sebeee.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(sejoon);
			Collections.sort(sebeee);
			
			
			int idx = 0;
			while(!(sejoon.isEmpty() || sebeee.isEmpty())) {
				if(sejoon.get(idx) > sebeee.get(idx)) {
					sebeee.remove(0);
				} else if(sejoon.get(idx) < sebeee.get(idx)) {
					sejoon.remove(0);
				} else {
					sebeee.remove(0);
				}
			}
			
			if(sejoon.size() > sebeee.size()) {
				System.out.println("S");
			} else {
				System.out.println("B");
			}
		}
		
		
	}
	
	
}
