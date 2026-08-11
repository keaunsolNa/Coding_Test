import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		
		int[] B = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) B[i] = Integer.parseInt(st.nextToken());
		
		int winP = 0;
		for(int i = 0; i < N; i++) 
			winP += A[i] > B[i] ? 3 : A[i] < B[i] ? 0 : 1;
			
		System.out.println(winP);
	}
}
