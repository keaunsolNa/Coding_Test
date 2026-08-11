import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[2][3];
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[0][i] = Integer.parseInt(st.nextToken());
			arr[1][i] = Integer.parseInt(st.nextToken());
		}
		
		int temp = arr[0][0];
		if(arr[0][1] == temp) {
			System.out.print(arr[0][2]);
		} else if(arr[0][2] == temp) {
			System.out.print(arr[0][1]);
		} else {
			System.out.print(arr[0][0]);
		}
		
		System.out.print(" ");
		temp = arr[1][0];
		if(arr[1][1] == temp) {
			System.out.print(arr[1][2]);
		} else if(arr[1][2] == temp) {
			System.out.print(arr[1][1]);
		} else {
			System.out.print(arr[1][0]);
		}
	}
}
