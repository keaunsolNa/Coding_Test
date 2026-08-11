import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			
			Stack<String> shirt = new Stack<>();
			Stack<String> pants = new Stack<>();
			Stack<String> socks = new Stack<>();
			
			for(int i = 0; i < N; i++) {
				
				st = new StringTokenizer(br.readLine(), "(");
				String value = st.nextToken();
				value = value.substring(0, value.length() - 1);
				
				String key = st.nextToken();
				key = key.substring(0, key.length() - 1);

				switch(key) {
					
					case "shirt" : shirt.add(value); break;
					
					case "pants" : pants.add(value); break;
					
					case "socks" : socks.add(value); break;
					
				}
			}
			
			while(!shirt.isEmpty()) {
				
				if(!pants.isEmpty()) {
					
					if(!socks.isEmpty()) {
						
						sb.append(shirt.pop() + ", " + pants.pop() + ", " + socks.pop() +"\n");
						continue;
					}
				}
				
				break;
			}
			
			sb.append("\n");
		
		}
		
		System.out.println(sb);
	}
}
