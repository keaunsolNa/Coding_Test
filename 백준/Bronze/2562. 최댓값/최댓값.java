import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test12();
	}

	public static void test12() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		int max = -1;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index + 1);
	}
}
