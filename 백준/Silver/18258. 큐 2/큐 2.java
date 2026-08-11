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
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> q = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer command;
		
		while(N-- > 0) {
			command = new StringTokenizer(br.readLine(), " ");	
			
			switch(command.nextToken()) {	
			
			case "push":
				
				q.offer(Integer.parseInt(command.nextToken()));	
				break;
				
			case "pop" :
				
				Integer item = q.poll();	
				if(item == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(item).append('\n');
				}
				break;
				
			case "size":	
				sb.append(q.size()).append('\n');
				break;
				
			case "empty":
				if(q.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
				break;
				
			case "front":
				
				Integer ite = q.peek();
				if(ite == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(ite).append('\n');
				}
				break;
				
			case "back":
				
				Integer it = q.peekLast();	 
				if(it == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(it).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);
		
	}
}
