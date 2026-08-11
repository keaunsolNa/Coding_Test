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
		test32();
	}

	public static void test32() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i = 0; i < order; i++) {
			String orderStr = br.readLine();
			
			if(orderStr.contains("push")) {
				
				int orderValue = Integer.parseInt(orderStr.split(" ")[1]);
				deque.add(orderValue);
				
			} else if(orderStr.contains("pop")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.poll());
				}
				
			} else if(orderStr.contains("size")) {

				System.out.println(deque.size());
				
			} else if(orderStr.contains("empty")) {
				
				if(deque.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				
			} else if(orderStr.contains("front")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peek());
				}
				
			} else {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekLast());
				}
				
			}
			
		}
	}
}
