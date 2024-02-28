import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> tree = new ArrayList<>();
		int last = 1;
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			int length = Integer.parseInt(st.nextToken());
			tree.add(length);
			if(length > last) last = length;
		};
		
		int first = 0;
		while(first < last) {
			
			int mid = (first + last)/2;
			long sum = 0;
			
			for(int treeH : tree) {
				
				if(treeH - mid > 0) {
					sum += treeH - mid;
				}
			}
			
			if(sum < M) {
				last = mid;
			}
			
			else {
				first = mid +1;
			}
			
		}
		
		System.out.println(first - 1);
	}
}