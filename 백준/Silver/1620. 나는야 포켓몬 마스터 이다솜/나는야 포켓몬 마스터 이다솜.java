import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> pocketmon = new LinkedHashMap<>();
		String[] nameArr = new String[N + 1];
		
		for(int i = 1; i < N + 1; i++) {
			String name = br.readLine();
			pocketmon.put(name, i);
			nameArr[i] = name;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			
			String temp = br.readLine();
			try {
				
				int number = Integer.parseInt(temp);
				sb.append(nameArr[number]).append("\n");
				
			} catch(java.lang.NumberFormatException e) {
				
				sb.append(pocketmon.get(temp)).append("\n");
				
			}
			
		}
		
		System.out.println(sb);
	}
}
