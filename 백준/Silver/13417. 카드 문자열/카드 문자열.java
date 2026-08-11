import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int length = Integer.parseInt(br.readLine());
			char[] input = br.readLine().replaceAll(" ", "").toCharArray();
			
			sb2.append(input[0]);
			for(int i = 1; i < input.length; i++) {
				if((int)sb2.charAt(0) >= (int)input[i]) sb2.insert(0, input[i]);
				else sb2.append(input[i]);
			}
			
			sb.append(sb2 + "\n");
			sb2.setLength(0);
		}
		
		System.out.println(sb);
	}
}
