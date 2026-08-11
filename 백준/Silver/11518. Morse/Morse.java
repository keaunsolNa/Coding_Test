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

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

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
}
