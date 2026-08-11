import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		System.out.println("Gnomes:");
		for(int i = 0; i < testCase; i++) {
			String[] arr = br.readLine().split(" ");
			if(Integer.parseInt(arr[0]) < Integer.parseInt(arr[1]) && Integer.parseInt(arr[1]) < Integer.parseInt(arr[2])) {
				System.out.println("Ordered");
			} else if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) && Integer.parseInt(arr[1]) > Integer.parseInt(arr[2])) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}
		}
	}
}
