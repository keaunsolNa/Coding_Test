import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = i + 1;
		
		int gift = 1;
		while(N --> 0) {
			int k =Integer.parseInt(br.readLine());
			
			arr[k - 1] = gift;
			gift++;
		}
		
		for (int i : arr) System.out.println(i);
	
	}
}
