import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Set<String> dancer = new HashSet<>();
		dancer.add("ChongChong");
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String dancer1 = st.nextToken();
			String dancer2 = st.nextToken();
			if(dancer.contains(dancer1)) {
				dancer.add(dancer1);
				dancer.add(dancer2);
			}
			if(dancer.contains(dancer2)) {
				dancer.add(dancer1);
				dancer.add(dancer2);
			}
			
		}
		
		System.out.println(dancer.size());
		
	}
}
