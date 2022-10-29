package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Sort02 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 우리 집 밑에 편의점이 있는데
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		for(int i = 0; i < N; i++) {
			String key = st.nextToken();
			map.put(key, map.getOrDefault(key, 0) + 1);
			int number = map.get(key);
			if(max < number) max = number;
		}

		System.out.println(max);
		
	}
	
	// 애너그램
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringBuilder sb = new StringBuilder();
			String temp = br.readLine();
			String str1 = temp.split(" ")[0];
			String str2 = temp.split(" ")[1];
			sb.append(str1 + " & " + str2 + " are ");
			if(str1.length() != str2.length()) {
				sb.append("NOT anagrams.");
			} else {
				
				int str1ToInt = 0;
				int str2ToInt = 0;
				for(int j = 0; j < str1.length(); j++) {
					str1ToInt += str1.charAt(j);
					str2ToInt += str2.charAt(j);
				}
				
				if(str1ToInt == str2ToInt) {
					sb.append("anagrams.");
				} else {
					sb.append("NOT anagrams.");
				}
			}
			
			System.out.println(sb);
			
		}
		
	}
	
	// 장신구 명장 임스
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int P = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		while(P < 200 && cnt != N) {
			P += arr[cnt];
			cnt++;
		}
		
		System.out.println(cnt);
	}
	
	// APC는 왜 서브태스크 대회가 되었을까? 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
        Problem[] arr = new Problem[N];
        
        for (int i = 0; i < N; i++) {
        	
            st = new StringTokenizer(br.readLine());
            int easy = Integer.parseInt(st.nextToken());
            int hard = Integer.parseInt(st.nextToken());
            arr[i] = new Problem(easy, hard);
            
        }
        Arrays.sort(arr);
        
        int score = 0;
        for (int i = 0; i < N; i++) {
        	
            if (L >= arr[i].hard && K != 0) {
            	
                score += 140;
                K--;
                
            } else if (L >= arr[i].easy && K != 0) {
            	
                score += 100;
                K--;
                
            }
            if (K == 0)
                break;
        }
        
        System.out.println(score);
		
		
	}
	
    static class Problem implements Comparable<Problem> {
        int easy;
        int hard;
        Problem(int easy, int hard) {
            this.easy = easy;
            this.hard = hard;
        }
        @Override
        public int compareTo(Problem o) {
            if (this.hard == o.hard)
                return this.easy - o.easy;
            return this.hard - o.hard;
        }
    }
	
	// 알고리즘 수업 - 선택 정렬 1
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = N-1; i > 0; i--) {
			
			int m = 0;
			int idx = 0;
			for(int j = 0; j <= i; j++) {
				if(m < arr[j]) {
					m = arr[j];
					idx = j;
				}
			}
			
			if(arr[i] != m) {
				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx] = t;
				cnt++;
				
				if(cnt == K) {
					System.out.println(Math.min(arr[i], arr[idx]) + " " + Math.max(arr[i], arr[idx]));
					break;
				}
			}
		}
		if(cnt < K) System.out.println("-1");
	}
	
	// 알고리즘 수업 - 버블 정렬 1
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int temp;
        
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++) {
                
                if(arr[j] > arr[j + 1]) {
                    K--;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    if(K == 0) {
                    	System.out.println(arr[j] + " " + arr[j+1]);
                    	return;
                    }
                }
                
            }
        }

        if(K > 0) {
        	System.out.println(-1);
        }
	}
	
	// 도비의 난독증 테스트
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String input = "";
		
		while(!(input = br.readLine()).equals("0")) {
			int T = Integer.parseInt(input);
			
			List<String> array = new ArrayList<>();
			
			for(int i = 0; i < T; i++) {
				array.add(br.readLine());
			}
			
			Collections.sort(array, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.toLowerCase().compareTo(o2.toLowerCase());
				}
			});
			
			System.out.println(array.get(0));
		}
		
		
	}
	
	// 영화 평가
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int sum = 0;
		int cnt = 0;
		for(int i = L; i < N-H; i++) {
			sum += arr[i];
			cnt++;
		}
		
		System.out.println((double)sum/cnt);
	}
	
	// Favorite Number 
	public static void test09() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int V = Integer.parseInt(br.readLine());
			Map<Integer, Integer> map = new HashMap<>();
			
			for(int j = 0; j < V; j++) {
				int temp = Integer.parseInt(br.readLine());
				map.put(temp, map.getOrDefault(temp, 0) + 1);
			}
			List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
			entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			    @Override
			    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
			    	if(o2.getValue() == o1.getValue()) {
			    		return o1.getKey() - o2.getKey();
			    	} else {
			    		return o2.getValue() - o1.getValue();
			    	}
			    }
			});
			
			System.out.println(entryList.get(0).getKey());
			
		}
		
	}
	
	// K번째 수
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		System.out.println(arr[K-1]);
	}
}
