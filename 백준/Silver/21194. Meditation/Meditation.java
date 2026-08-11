import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] point = new int[n];
		for(int i = 0; i < n; i++)
			point[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(point);
		
		int sum = 0;
		for(int i = point.length - 1; i > point.length - k - 1; i--) 
			sum += point[i];
		
		System.out.println(sum);
	}
}
