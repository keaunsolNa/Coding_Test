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
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Set<String> hashSet = new HashSet<>();
		
		for(int i = 0; i <= s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				if(!hashSet.contains(s.substring(i, j))) {
					hashSet.add(s.substring(i, j));
				}
			}
		};
		
		System.out.println(hashSet.size());
		
	}
}
