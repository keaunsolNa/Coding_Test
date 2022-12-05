package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class DataStructure06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
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

	// 야근
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	}
	
	// 파일 정리
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
	}

	// 꿍의 여친 만들기 
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
	}

	// 생태학
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

	// 최대 힙
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	// 최소 힙 
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	// N번째 큰 수
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
	}

	// 세 번째
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}





}
