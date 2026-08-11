import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		Map<String, Character> map = new HashMap<>();
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			char key = st.nextToken().charAt(0);
			String value = st.nextToken();
			
			map.put(value, key);
		}
		
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i += 4) {
			
			String part = input.substring(i, i+4);
			
			if(map.containsKey(part)) sb.append(map.get(part));
			else sb.append("?");
			
		}
		
		System.out.println(sb);
		
	
	}
}
