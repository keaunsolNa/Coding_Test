import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1001];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = (((1)+(int)Math.sqrt(1+(8*(i-1))))/2);
		
		for(int i= A; i <= B; i++) sum += arr[i];

		System.out.println(sum);
	}
}
