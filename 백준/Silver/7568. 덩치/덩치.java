import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test25();
	}

	public static void test25() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[][] people = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			people[i][0] = Integer.parseInt(st.nextToken());
			people[i][1] = Integer.parseInt(st.nextToken());
		}
		int[] ranking = new int[N];
		int rank = 1;
		for(int i = 0; i < people.length; i++) {
			int tempWeight = people[i][0];
			int tempHeight = people[i][1];
			for(int j = 0; j < people.length; j++) {
				if(tempWeight < people[j][0] && tempHeight < people[j][1]) {
					rank++;
				} 
			}
			ranking[i] = rank;
			rank = 1;
		}
	
		StringBuilder sb = new StringBuilder();
		for (int i : ranking) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
}
