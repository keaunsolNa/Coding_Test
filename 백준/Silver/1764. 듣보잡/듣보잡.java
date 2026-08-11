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

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> hashMap = new HashMap<>();
		List<String> arrList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			hashMap.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine();
			hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
			if(hashMap.get(temp) == 2) arrList.add(temp);
		}
		
		Collections.sort(arrList);
		sb.append(arrList.size() + "\n");
		for (String string : arrList) {
			sb.append(string + "\n");
		}
		
		System.out.println(sb);
	}
}
