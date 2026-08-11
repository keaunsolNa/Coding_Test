import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static int N; 

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) 
			arr[Integer.parseInt(st.nextToken())]++;
		
		int max = 0;
		int idx = 0;
		
		for(int i = 1; i <= N; i++) {
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		
		for(int i = 1; i <= N; i++) {
			if(idx != i && arr[i] == max) {
				System.out.println("skipped");
				return;
			}
		}
		
		System.out.println(idx);
	}
}
