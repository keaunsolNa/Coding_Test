import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String input = br.readLine().replaceAll(" ", "");
			Map<Character, Integer> map = new TreeMap<>(); 
			
			for(int j = 0; j < input.length(); j++) {
				char key = input.charAt(j);
				map.put(key, map.getOrDefault(key, 0) + 1);
			}
			
			int max = 0;
			char answer = ' ';
			boolean flag = true;
			for (Character key : map.keySet()) {
				if(map.get(key) > max) {
					max = map.get(key);
					answer = key;
					flag = true;
				} else if(map.get(key) == max) {
					flag = false;
				}
			}
			
			if(flag) {
				sb.append(answer).append("\n");
			} else {
				sb.append("?").append("\n");
			}
		}
		
		System.out.print(sb.deleteCharAt(sb.length() - 1));
	}
}
