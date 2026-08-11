package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}
	
	
	// 행운의 수
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
    	
		for(int i = 0; i < T; i++) {
			int length = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int[] AArr = new int[length];
			for(int a = 0; a < length; a++) {
				AArr[a] = Integer.parseInt(st.nextToken());
				
			}
			
			length = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int[] BArr = new int[length];
			for(int a = 0; a < length; a++) {
				BArr[a] = Integer.parseInt(st.nextToken());
				
			}
			
			length = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int[] CArr = new int[length];
			for(int a = 0; a < length; a++) {
				CArr[a] = Integer.parseInt(st.nextToken());
				
			}
			
	    	Set<String> answer = new HashSet<>();
	    	
	    	for (int str1 : AArr) {
				
	    		for (int str2 : BArr) {
	    			
	    			for (int str3 : CArr) {
	    				String target = (str1 + str2 + str3) + "";
	    				
	    				boolean flag = true;
	    				
	    				for(int chk = 0; chk < target.length(); chk++) {
	    					if(target.charAt(chk) != '5' && target.charAt(chk) != '8') {
	    						flag = false;
	    					}
	    				}
	    				
	    				if(flag) {
	    					answer.add(target);
	    				}
	    			}
	    		}
			}
			System.out.println(answer.size());
			
		}
	}


}
