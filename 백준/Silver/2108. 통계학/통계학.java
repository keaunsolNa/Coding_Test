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
		test12();
	}

    public static void test12() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] arr = new int[testCase];
		double sum = 0;
		
		for(int i = 0; i < testCase; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);

		int mod = findMod(arr, testCase);
		
		System.out.println(Math.round(sum/testCase));
		System.out.println(arr[arr.length/2]);
		System.out.println(mod);
		System.out.println(arr[testCase - 1] - arr[0]);
    }

    public static int findMod(int[] arr, int testCase) {
		
		int cnt = 0;
		int max = -1;
		int mod = arr[0];
		boolean check = false;
		
		for (int i = 0; i < testCase - 1; i++) {
			
			if(arr[i] == arr[i+1]) {
				cnt++;
			} else {
				cnt = 0;
			}
			
			if(max < cnt) {
				max = cnt;
				mod = arr[i];
				check = true;
			} else if(max == cnt && check == true) {
				mod = arr[i];
				check = false;
			}
		}
		
		return mod;
	}
}
