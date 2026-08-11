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

	public static void main(String[] args) throws IOException {
		test39();
	}

	public static void test39() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int min = 256;
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(min > arr[i][j]) min = arr[i][j];
				if(max < arr[i][j]) max = arr[i][j];
			}
		}
		
		int time = 99999999;
		int high = 0;
		
		for(int i = min; i <= max; i++) {
			int count = 0;
			int block = B;

			for(int j = 0; j < N; j++) {
				for(int k = 0; k < M; k++) {

					if(i < arr[j][k]) {
						count += ((arr[j][k] - i) * 2);
						block += (arr[j][k] - i);

					} else {
						count += (i - arr[j][k]);
						block -= (i - arr[j][k]);
					}
				}
			}

			if(block < 0) break;
			
			if(time >= count) {
				time = count;
				high = i;
			}
		}
		System.out.println(time + " " + high);
	}
}
