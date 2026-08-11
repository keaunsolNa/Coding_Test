import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studentNumber = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> arrList = new ArrayList<>();
		
		for(int i = 1; i <= studentNumber; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arrList.add(temp, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = arrList.size()-1; i >= 0; i--) {
			sb.append(arrList.get(i) + " ");
		}
		
		System.out.println(sb);
	}
}
