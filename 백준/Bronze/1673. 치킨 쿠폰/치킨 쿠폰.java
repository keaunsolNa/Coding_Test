import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String input = br.readLine();
            if (input == null) break;
            String[] inputs = input.split(" ");
            
            int n = Integer.parseInt(inputs[0]);
            int k = Integer.parseInt(inputs[1]);
            
            System.out.println(solve(n, 0, k));

        }
        
	}	

    private static int solve(int coupon, int ordered, int k) {
        if (coupon < k) return ordered + coupon;
        
        return solve((coupon / k) + (coupon % k), ordered + (coupon - coupon % k), k);
    }
}
