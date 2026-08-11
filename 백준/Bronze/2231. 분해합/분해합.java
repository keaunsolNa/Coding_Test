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
		test14();
	}

    public static void test14() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int targetNumber = 0;
		for(targetNumber = 0; targetNumber < N; targetNumber++) {
			sum = targetNumber;
			for(int j = 0; j < (targetNumber + "").length(); j++) {
				sum += Character.getNumericValue((targetNumber + "").charAt(j));
			}
			if(sum == N) {
				break;
			}
		}
		if(targetNumber == N) {
			targetNumber = 0;
		}
		System.out.println(targetNumber);
    }
}
