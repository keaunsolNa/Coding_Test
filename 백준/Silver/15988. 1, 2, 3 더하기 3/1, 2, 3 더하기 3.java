import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		long[] nums = new long[1000001];
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 4;
		
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 4; j <= N; j++) {
				nums[j] = (nums[j - 1]  + nums[j - 2] + nums[j - 3]) % 1000000009;
			}
			
			System.out.println(nums[N]);
		}		
		
		
	}
}
