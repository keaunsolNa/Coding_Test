import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int input = -99;
		int max = 0;
		Queue<Integer> queue = new LinkedList<>();
		while((input = Integer.parseInt(br.readLine())) != -1) {
			if(input != 0 && max < N) {
				queue.add(input);
				max++;
			} else if(input == 0) {
				queue.poll();
				max--;
			}
		}

		if(queue.isEmpty()) {
			System.out.println("empty");
		}
		for (Integer integer : queue) {
			System.out.print(integer + " ");
		}
		
	}
}
