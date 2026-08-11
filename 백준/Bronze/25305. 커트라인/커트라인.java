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

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
        int testCase = Integer.parseInt(st.nextToken());
        int awardPeople = Integer.parseInt(st.nextToken());
		
        Integer[] arr = new Integer[testCase];
        
        st = new StringTokenizer(br.readLine());
		for(int i = 0; i < testCase; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, Collections.reverseOrder());
		
		int answer = 0;
		for(int i = 0; i < awardPeople; i++) {
			answer = arr[i];
		}

		System.out.println(answer);
	}
}
