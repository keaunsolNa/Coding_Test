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
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			arrList.add(Integer.parseInt(br.readLine()));
		}
		
		int max = 0;
		int cnt = 0;
		for(int i =  arrList.size()-1; i >= 0; i--) {
			if(arrList.get(i) > max) {
				max = arrList.get(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
