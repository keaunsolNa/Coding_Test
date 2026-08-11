import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int ans = 0;
		while(C --> 0) {
			
			int v = Integer.parseInt(br.readLine());
			sum += v;
			
		    if (sum > ans) ans = sum;
		}
		
		System.out.println(ans + 100);
	}
}
