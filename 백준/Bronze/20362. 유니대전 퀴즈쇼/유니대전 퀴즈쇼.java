import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		String winner = st.nextToken();
		
		Map<String, String> map = new LinkedHashMap<>();
		String answer = "";
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String ans = st.nextToken();
			map.put(name, ans);
			
			if(name.equals(winner)) answer = ans;
		}
		
		int cnt = 0;
		for(String key : map.keySet()) {
			if(key.equals(winner)) break;
			if(map.get(key).equals(answer)) cnt++;
				
		}
		
		System.out.println(cnt);
		
	}
}
