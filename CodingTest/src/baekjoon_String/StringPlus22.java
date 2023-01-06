package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StringPlus22 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// It’s Cold Here! 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int cold = Integer.MAX_VALUE;
		String city = "";
		while((input = br.readLine()) != null) {
			String name = input.split(" ")[0];
			int temp = Integer.parseInt(input.split(" ")[1]);
			
			if(cold > temp) {
				cold = temp;
				city = name;
			}
			
		}
		
		System.out.println(city);
		
		
	}
	
	// 클레어와 팰린드롬
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        
        for(int i = 0; i < N; i++) {
        	
        	char init = ' ';
        	switch(input.charAt(i)) {
        	
        		case '?' : init = input.charAt(N - i - 1) == '?' ? 'a' : input.charAt(N - i - 1); break;
        		default : init = input.charAt(i);
        		
        	}
        	
        	sb.append(init);
        }
        System.out.println(sb);
        
	}

	// 끝말잇기
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean can = true;
        char target = st.nextToken().charAt(0);
        		
        for(int i = 0; i < N - 1; i++) {
        	
        	if(st.nextToken().charAt(0) != target) {
        		can = false;
        		break;
        	}
        }

        if(can) System.out.println(1);
        else System.out.println(0);
	}
	
	// George Boole
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String[] input = br.readLine().split(" ");
		
		boolean answer = true;
		switch(input[1]) {
		
			case "AND" :  answer = input[0].equals("true") ? input[2].equals("true") ? true : false : false; break;
			case "OR" :  answer = input[0].equals("true") ? true : input[2].equals("true") ? true : false; break;
		}
		
		System.out.println(answer);
	}
	
	// “Bubble Gum, Bubble Gum, in the dish, how many pieces do you wish?” 
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            List<String> inputList = Arrays
                    .stream(br.readLine().split(" "))
                    .collect(Collectors.toList());

            int startIdx = inputList.indexOf(br.readLine());
            int gumCount = Integer.parseInt(br.readLine());
            int inputListSize = inputList.size();
            int winnerIdx = (startIdx + gumCount - 1) % inputListSize;

            sb.append(inputList.get(winnerIdx)).append("\n");

        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
    // IOI 文字列 (IOI String)
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) cnt += S.charAt(i) == 'I' ? 0 : 1; 
			if(i % 2 == 1) cnt += S.charAt(i) == 'O' ? 0 : 1; 
		}
		
		
		if(S.length() % 2 == 0) cnt++;
		
		System.out.println(cnt);
		
    }

	// 영단어 암기는 괴로워
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
        	String input = br.readLine();
        	
        	if(input.length() < M) continue;
        	map.put(input, map.getOrDefault(input, 0) + 1);
        	
        }
        
        List<String> words = map.keySet().stream().collect(Collectors.toList());
		
        words.sort((o1, o2) -> {
            int c1 = map.get(o1);
            int c2 = map.get(o2);

            if(c1 == c2){
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); 
                }
                return o2.length() - o1.length(); 
            }
            return c2 - c1;
        });
        
        for(int i = 0; i < words.size(); i++) 
        	sb.append(words.get(i)).append("\n");
        
        System.out.println(sb);
	}
	
	// 유진수
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] charArr = str.toCharArray();
		int len = str.length();
		
		int[] a = new int[len];
		int[] b = new int[len];
		for(int i = 0; i < len - 1; i++) {
			int j = len - 1 - i;
			
			if(i == 0) {
				a[i] = (int)(charArr[i] - '0');
				b[j] = (int)(charArr[j] - '0');
				continue;
			}
			
			a[i] = a[i - 1] * (int)(charArr[i] - '0');
			b[j] = b[j + 1] * (int)(charArr[j] - '0');
		}
		
		boolean chk = false;
		for(int i = 0; i < len - 1; i++) {
			if(a[i] == b[i + 1]) {
				chk = true;
				break;
			}
		}
		
		String result = chk ? "YES" : "NO";
		System.out.print(result);
	}
	
	// キャピタリゼーション (Capitalization)
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		System.out.println(input.replaceAll("joi", "JOI"));
	}
	
    // 運動会 (Sports Day) 
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        String input = br.readLine();
        
        long RA = countChar(input, 'R');
        long KA = countChar(input, 'W');
    
        if(RA == K) System.out.println("W");
        else System.out.println("R");
		
	}
  
	public static long countChar(String str, char ch) {
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}
	
	
}
