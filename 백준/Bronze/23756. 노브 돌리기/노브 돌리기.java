import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int first = Integer.parseInt(br.readLine());
		
		long total = 0;
		while(N --> 0) {
			
			int target = Integer.parseInt(br.readLine());
			total += Math.min(Math.min(Math.abs(target - first), first + (360 - target)), (360 - first) + target);
			
			first = target;
		}
		
		System.out.println(total);
	}
}
