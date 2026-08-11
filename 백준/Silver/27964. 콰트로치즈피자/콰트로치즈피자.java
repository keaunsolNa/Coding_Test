import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<String> set = new HashSet<>();
		while(st.hasMoreTokens()) {
			set.add(st.nextToken());
		}
		
		Iterator<String> iter = set.iterator();
		
		int cnt = 0;
		boolean flag = false;
		while(iter.hasNext()) {
			
			String token = iter.next();
			if(token.endsWith("Cheese")) cnt++;
			
			if(cnt >= 4) {flag = true; break; };
		}
		
		System.out.println(flag ? "yummy" : "sad");
	}
}
