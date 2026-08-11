import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] tropy = new int[N];
		for(int i = 0; i < N; i++) tropy[i] = Integer.parseInt(br.readLine());
		
		int prev = tropy[0];
		int leftSee = 1;
		for(int i = 1; i < N; i++) {
			
			if(prev < tropy[i]) {
				leftSee++;
				prev = tropy[i];
			}
		}
		
		prev = tropy[N - 1];
		int rightSee = 1;
		for(int i = N - 2; i >= 0; i--) {
			
			if(prev < tropy[i]) {
				rightSee++;
				prev = tropy[i];
			}
		}
		
		System.out.println(leftSee);
		System.out.println(rightSee);
		
	}
}
