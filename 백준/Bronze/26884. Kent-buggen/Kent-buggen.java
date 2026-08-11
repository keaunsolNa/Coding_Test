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
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		Set<String> list = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			
			String name = br.readLine();
			
			if(list.contains(name)) set.add(name);
			else list.add(name);
		}
		
		System.out.println(set.size());
	}
}
