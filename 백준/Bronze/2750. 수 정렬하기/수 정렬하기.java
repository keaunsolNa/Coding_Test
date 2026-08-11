import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test01();
	}

	public static void test01() {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int[] list = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			int temp = sc.nextInt();
			list[i] =temp;
		}
	
		Arrays.sort(list);
		for (int i : list) {
			System.out.println(i);
		}
	}
}
