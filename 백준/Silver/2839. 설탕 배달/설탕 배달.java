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

	public static void main(String[] args) {
		test21();
	}

	public static void test21() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = -1;
		for(int i = N/5; i > 0; i--) {
			if(((N - (5*i))%3) == 0) {
				answer = i + ((N - (5*i))/3);
				break;
			} 
		}
		
		if(N%3 == 0  && answer == -1) {
			answer = N/3;
		}
		System.out.println(answer);
		
	}
}
