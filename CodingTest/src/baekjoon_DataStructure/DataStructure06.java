package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	// 절댓값 힙
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
        	
            @Override
            public int compare(Integer o1, Integer o2){
                int A = Math.abs(o1);
                int B = Math.abs(o2);
                if(A > B)
                    return A - B;

                else if(A == B){
                    if(o1 > o2) return 1;
                    else return -1;
                }

                else
                    return -1;
            }
        });
		
        int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int number = Integer.parseInt(br.readLine());
			
			if(number != 0) {
				pq.add(number);
			} else {
				if(pq.peek() != null) {
					System.out.println(pq.poll());
				} else {
					System.out.println("0");
				}
			}
		}
		
	}
	
	// 지프의 법칙
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pattern = "^[A-Za-z]*$";
		String input = "";
		StringBuilder sb2 = new StringBuilder();
		while((input = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			Map<String, Integer> wordMap = new TreeMap<>();
			int n = Integer.parseInt(input);
			
			String inputText = "";
			while(!(inputText = br.readLine()).equals("EndOfText")) {
				if(inputText.equals("")) {
					continue;
				}
				inputText = inputText.replaceAll("[.]", " ");
				inputText = inputText.replaceAll("[,]", " ");
				inputText = inputText.replaceAll("^[1-9]*$", " ");
				String[] temp = inputText.split(" ");
				
				for(int i = 0; i < temp.length; i++) {
					String vocal = temp[i].toLowerCase();
					if(vocal.matches(pattern) && (!vocal.equals(""))) {
						wordMap.put(vocal, wordMap.getOrDefault(vocal, 0)+1);
					}
				}
			}
			
			for (String vocal : wordMap.keySet()) {
				if(wordMap.get(vocal) == n) {
					sb.append(vocal).append("\n");
				}
			}
			
			if(sb.toString().isEmpty()) {
				sb2.append("There is no such word.").append("\n");
			} else {
				sb2.append(sb);
			}
			
			sb2.append("\n");
		}
		
		sb2.deleteCharAt(sb2.length() - 1);
		sb2.deleteCharAt(sb2.length() - 1);
		System.out.print(sb2);
	}

	// Morse 
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		Map<String, String> morseMap = new HashMap<>();
		for(int i = 0; i < 26; i++) {
			st = new StringTokenizer(br.readLine());
			String alp = st.nextToken();
			String morse = st.nextToken();
			
			morseMap.put(alp, morse);
		}
		
		int morseWordT = Integer.parseInt(br.readLine());
		Map<String, String> dictionaryMap = new HashMap<>(); 
		
		for(int i = 0; i < morseWordT; i++) {
			String temp = br.readLine();
			sb = new StringBuilder();
			for(int j = 0; j < temp.length(); j++) {
				sb.append(morseMap.get(temp.charAt(j)+""));
			}
			
			dictionaryMap.put(sb.toString(), temp);
		}
		
		String input = "";
		while(!(input = br.readLine()).equals("0")) {
			boolean flag = true;
			String target = "";
			int testCase = Integer.parseInt(input);
			sb = new StringBuilder();
			
			for(int i = 0; i < testCase; i++) {
				String inputMorse = br.readLine();
				
				if(dictionaryMap.containsKey(inputMorse)) {
					sb.append(dictionaryMap.get(inputMorse) + " ");
				} else {
					if(flag) {
						target = inputMorse;
					}
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println(sb.deleteCharAt(sb.length() - 1));
			} else {
				System.out.println(target + " not in dictionary.");
			}
		}
		
	}
	
	// 회전하는 큐
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] idxs = new int[m];
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < m; i++) {
			idxs[i] = Integer.parseInt(st.nextToken());
		}
		
		LinkedList<Integer> dq = new LinkedList<>();
		
		for(int i=1; i<n+1; i++) dq.offer(i);
		
		int count = 0;
		for(int idx : idxs) {
			
			while(true) {
				
				if(dq.peek() == idx) {
					
					dq.poll();
					break;
					
				} else {
					
					if(dq.indexOf(idx) < (double)dq.size() / 2) {
						
						while(dq.peek() != idx) {
							dq.offerLast(dq.pollFirst());
							count++;
						}
						
					} else {
						
						while(dq.peek() != idx) {
							dq.offerFirst(dq.pollLast());
							count++;
						}
						
					}
				}
			}
		}
		
		System.out.println(count);
		
		
	}

	// 카드
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < n; i++) {
        	Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int max = 0;
        Long target = (long) 0;
        for (Long key : map.keySet()) {
			
        	if(map.get(key) > max) {
        		max = map.get(key);
        		target = key;
        	} else if(map.get(key) == max) {
        		if(target > key) {
        			target = key;
        		}
        	}
		}
        
		System.out.println(target);
	}

	// 행운의 수
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
    	
		for(int i = 0; i < T; i++) {
			int length = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int[] AArr = new int[length];
			for(int a = 0; a < length; a++) {
				AArr[a] = Integer.parseInt(st.nextToken());
				
			}
			
			length = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int[] BArr = new int[length];
			for(int a = 0; a < length; a++) {
				BArr[a] = Integer.parseInt(st.nextToken());
				
			}
			
			length = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int[] CArr = new int[length];
			for(int a = 0; a < length; a++) {
				CArr[a] = Integer.parseInt(st.nextToken());
				
			}
			
	    	Set<String> answer = new HashSet<>();
	    	
	    	for (int str1 : AArr) {
				
	    		for (int str2 : BArr) {
	    			
	    			for (int str3 : CArr) {
	    				String target = (str1 + str2 + str3) + "";
	    				
	    				boolean flag = true;
	    				
	    				for(int chk = 0; chk < target.length(); chk++) {
	    					if(target.charAt(chk) != '5' && target.charAt(chk) != '8') {
	    						flag = false;
	    					}
	    				}
	    				
	    				if(flag) {
	    					answer.add(target);
	    				}
	    			}
	    		}
			}
			System.out.println(answer.size());
			
		}
	}

	// 걸그룹 마스터 준석이
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, List<String>> girlGroup = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			List<String> memberName = new ArrayList<>();
			String teamName = br.readLine();
			int groupPeople = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < groupPeople; j++) {
				String member = br.readLine();
				memberName.add(member);
			}
			
			Collections.sort(memberName);
			girlGroup.put(teamName, memberName);
		}
		
		for(int i = 0; i < M; i++) {
			String name = br.readLine();
			int quiz = Integer.parseInt(br.readLine());
			
			if(quiz == 0) {
				for (String member : girlGroup.get(name)) {
					System.out.println(member);
				}
			} else {
				for(String team : girlGroup.keySet()) {
					if(girlGroup.get(team).contains(name)) {
						System.out.println(team);
					}
				}
			}
		}
		
	}

	// I AM IRONMAN 
	public static void test08() throws NumberFormatException, IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        
        Map<String, String> player = new HashMap<>();
        for(int i = 0; i < P; i++) {
        	String[] temp = br.readLine().split(" ");
        	player.put(temp[0], temp[1]);
        }
        
        int totalGrade = 0;
        boolean ironMan = true;
        
        for(int i = 0; i < N; i++) {
        	String name = br.readLine();
        	if(!player.containsKey(name)) {
        		totalGrade -= L;
        		if(totalGrade < 0) {
        			totalGrade = 0;
        		}
        	} else if(player.get(name).equals("W")) {
        		totalGrade += W;
        	} else {
        		totalGrade -= L;
        		if(totalGrade < 0) {
        			totalGrade = 0;
        		}
        	}
        	
        	if(totalGrade >= G) {
        		ironMan = false;
        	}
        	
        }
        
        if(ironMan) {
        	System.out.println("I AM IRONMAN!!");
        } else {
        	System.out.println("I AM NOT IRONMAN!!");
        }
	}

	// 풍선 터뜨리기
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<int[]> ballon = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		int target = arr[0];
		
		for(int i = 1; i < N; i++){
			ballon.add(new int[] {(i+1), arr[i]}); 
		}
		
		while(!ballon.isEmpty()) {

			if(target > 0) {
				for(int i = 1; i < target; i++) {
					ballon.add(ballon.poll());
				}
				
				int[] nxt = ballon.poll();
				target = nxt[1];
				sb.append(nxt[0]+ " ");
			}
			
			else {
				for(int i = 1; i < -target; i++	) {
					ballon.addFirst(ballon.pollLast());
				}
				
				int[] nxt = ballon.pollLast();
				target = nxt[1];
				sb.append(nxt[0]+" ");
			}
		}
				
		System.out.println(sb.toString());
	}

	// Letter Bank
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			String bank = st.nextToken();
			String str = st.nextToken();
			boolean flag = true;
			for(int j = 0; j < str.length(); j++) {
				if(countChar(bank, str.charAt(j)) <= 0) {
					flag = false;
					break;
				}
			}
			
			for(int j = 0 ; j < bank.length(); j++) {
				if(countChar(str, bank.charAt(j)) <= 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }





}
