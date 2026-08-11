import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int value1 = 1;
		int value2 = 1;
		boolean odd = false;
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] %2 == 1) {
				value1 *= arr[i];
				odd = true;
			} else {
				value2 *= arr[i];
			}
		}
		
		if(odd) {
			System.out.println(value1);
		} else {
			System.out.println(value2);
		}
		
	}
}
