import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test11();
	}

	public static void test11() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		int[] originArr = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			originArr[i] = Integer.parseInt(st.nextToken());
		}
		int[] sortedArr = originArr.clone();
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		Arrays.sort(sortedArr);

		int ranking = 0;
		for (int i : sortedArr) {
			
			if(!rankingMap.containsKey(i)) {
				rankingMap.put(i, ranking);
				ranking++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : originArr) {
			int rank = rankingMap.get(i);
			sb.append(rank).append(' ');
		}
		
		System.out.println(sb);
	}
}
