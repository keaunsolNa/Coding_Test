package baekjoon_DataStructure;

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

public class DataStructure01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// 줄 세우기
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
	
	// 막대기
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


	// 콘서트
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arrList.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arrList);
		
		int cnt = 0;
		for(int i = 0; i < arrList.size(); i++) {
			if(arrList.get(i) != i +1) {
				System.out.println(i + 1);
				cnt++;
				break;
			}
		}
		
		if(cnt == 0) {
			System.out.println(N + 1);
		}
	}


}
