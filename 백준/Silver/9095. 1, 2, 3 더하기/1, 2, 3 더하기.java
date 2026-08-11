import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[11];
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 4;
		
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 4; j <= N; j++) {
				nums[j] = nums[j - 1] + nums[j - 2] + nums[j - 3];
			}
			
			System.out.println(nums[N]);
		}
		
	}
}
