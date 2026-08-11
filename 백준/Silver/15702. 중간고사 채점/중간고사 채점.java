import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int winner = 0;
		int maxPoint = Integer.MIN_VALUE;
		for(int i = 1; i <= M ; i ++) {
			st = new StringTokenizer(br.readLine());
			int stuNumber = Integer.parseInt(st.nextToken());
			int sumPoint = 0;
			
			for(int j = 0; j < N; j++) {
				String answer = st.nextToken();
				if(answer.equals("O")) sumPoint += arr[j];
			}

			
			if(sumPoint > maxPoint) {
				maxPoint = sumPoint;
				winner = stuNumber;
			}
			
			if(sumPoint == maxPoint) {
				if(winner > stuNumber) winner = stuNumber;
			}
		}
		
		System.out.println(winner + " " + maxPoint);
	}
}
