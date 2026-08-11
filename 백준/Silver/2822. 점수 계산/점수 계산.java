import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[8];
		int[] idx = new int[8];
		int[] sort = new int[5];
		for(int i = 0; i < 8; i++) {
			int point = Integer.parseInt(br.readLine());
			arr[i] = point;
			idx[i] = point;
		}
		
		
		Arrays.sort(arr);
		
		int sum = 0;
		int idx2 = 0;
		for(int i = 3; i < 8; i++) {
			sum += arr[i];
			
			for(int j = 0; j < 8; j++) {
				if(arr[i] == idx[j]) {
					sort[idx2] = j+1;
					idx2++;
				}
			}
		}
		
		Arrays.sort(sort);
		System.out.println(sum);
		for (int i : sort) {
			System.out.print(i + " ");
		}
	}
}
