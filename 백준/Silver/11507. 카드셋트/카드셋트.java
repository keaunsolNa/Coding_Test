import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("P", 0);
		map2.put("K", 0);
		map2.put("H", 0);
		map2.put("T", 0);
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String temp = input.charAt(i)+ "" + input.charAt(i+1) + input.charAt(i+2);
			i += 2;
			
			if(map.containsKey(temp)) {
				sb.append("GRESKA");
				break;
			} else map.put(temp, 0);
			
			
			map2.put(temp.charAt(0)+"", map2.getOrDefault(temp.charAt(0)+"", 1) + 1);
		}
		
		if(sb.length() != 0) {
			System.out.println(sb);
		} else {
			sb.append(13 - map2.get("P")).append(" ");
			sb.append(13 - map2.get("K")).append(" ");
			sb.append(13 - map2.get("H")).append(" ");
			sb.append(13 - map2.get("T"));
			
			System.out.print(sb);
		}
		
		
	}
}
