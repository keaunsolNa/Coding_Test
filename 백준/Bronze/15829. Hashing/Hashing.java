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
		test38();
	}

	public static void test38() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = 1234567891;
		int strLength = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long sum = 0;
		long pow = 1;
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += (arr[i] - 'a' + 1) * pow % M;
			pow = pow * 31 % M; 
		}
		
		long answer = sum % M;
		
		System.out.println(answer);
		
	}
}
