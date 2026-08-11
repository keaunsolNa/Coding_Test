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

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		String[] stringArr = new String[testCase];
		
		for(int i = 0; i < testCase; i++) {
			stringArr[i] = br.readLine();
		}

		Arrays.sort(stringArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] one = o1.split(" ");
				String[] two = o2.split(" ");
				
				if(Integer.parseInt(one[1]) == Integer.parseInt(two[1])) {
					return Integer.parseInt(one[0]) - Integer.parseInt(two[0]);
				} else {
					return Integer.parseInt(one[1]) - Integer.parseInt(two[1]);
				}
			}
		});
		
		for (String string : stringArr) {
			System.out.println(string);
		}
	}
}
