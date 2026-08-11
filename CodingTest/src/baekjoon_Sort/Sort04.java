package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Sort04 {
	
	public static void main(String[] args) throws IOException {
		test06();
	}
	
	
	// 알고리즘 수업 - 삽입 정렬 1
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int cnt = 0;
        int target = 0;
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
			int position = i;
            // 자신의 바로 앞에 노드보다 값이 크기 전까지 뒤로 한칸씩 넣어줌 
            while (position > 0 && key < arr[position - 1]) {
            	cnt++;
                arr[position] = arr[position - 1];
                position--;
                
                if(cnt == 7) target = arr[position];
                flag = false;
            }
            if(flag == false) {
            	cnt++;
            	arr[position] = key;
            	
            	if(cnt == 7) target = arr[position];
            	flag = true;
            }
        }
        
        if(cnt <= K) {
        	System.out.println(-1);
        } else {
        	System.out.println(target);
        }
        
        
	}
	
	
	// Complexity
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < input.length(); i++) {
			set.add(input.charAt(i));
		}
		
		if(set.size() > 3) {
			System.out.println(set.size() - 2);
		} else if(set.size() > 2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
	
	
}
