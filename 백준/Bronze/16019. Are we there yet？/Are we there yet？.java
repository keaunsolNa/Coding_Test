import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int[] city = new int[5];
		
		city[0] = 0;
		city[1] = Integer.parseInt(st.nextToken());
		city[2] = Integer.parseInt(st.nextToken());
		city[3] = Integer.parseInt(st.nextToken());
		city[4] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 5; i++) {
			
			if(i != 0) {
				int temp = city[i];
				city[i] = city[i - 1];
				city[i - 1] = temp;
			}
			
			int middle = 0;
			for(int j = 0; j < 5; j++) {
				if(city[j] == 0) middle = j;
			}
			
			int[] ans = new int[5];
			for(int j = middle - 1; j >= 0; j--) {
				
				ans[j] += (city[j] + ans[j + 1]);
			}
			
			for(int j = middle + 1; j < 5; j++) {
				
				ans[j] += (city[j] + ans[j - 1]);
			}
			
			for (int j : ans) {
				System.out.print(j +" ");
			}
			
			System.out.println();
		}
		
	}
}
