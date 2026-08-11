import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test22();
	}

	public static void test22() throws IOException {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Integer> arrSet = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arrSet.add(Integer.parseInt(st.nextToken()) % 42);
		}
		
		br.close();
		
		System.out.println(arrSet.size());
	}
}
