import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		if(arr[1] - arr[0] == arr[2] - arr[1]) {
			System.out.println(arr[2] + (arr[1]-arr[0]));
		} else {
			if(arr[1] - arr[0] > arr[2] - arr[1]) {
				System.out.println(arr[0] + arr[2] - arr[1]);
			} else {
				System.out.println(arr[1] + arr[1] - arr[0]);
			} 
		}
	}
}
