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
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<String> arrList = new ArrayList<>();
		List<String> arrListReverse = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			String tempReverse = new StringBuilder(temp).reverse().toString();
			arrList.add(temp);
			arrListReverse.add(tempReverse);
		}
		
		for(int i = 0; i < arrList.size(); i++) {
			String temp = arrList.get(i);
			for(int j = 0; j < arrListReverse.size(); j++) {
				
				if(temp.equals(arrListReverse.get(j))) {
					System.out.println(arrList.get(i).length() + " " +  arrList.get(i).charAt(arrList.get(i).length()/2));
					return;
				}
			}
		}
	}
}
