import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		String[] strArr = new String[N];
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			char[] charArr = temp.toCharArray();
			Arrays.sort(charArr);
			
			String arr = "";
			for(int j = 0; j < charArr.length; j++) {
				arr += charArr[j];
			}
			strArr[i] = arr;
		}
		

		for(int i = 0; i < N; i++) {
			map.put(strArr[i], map.getOrDefault(strArr[i], 0) + 1);
		}
		
		System.out.println(map.size());
	}
}
