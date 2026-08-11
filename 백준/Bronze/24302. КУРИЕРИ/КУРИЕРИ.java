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
	
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		A /= 1000;
		B /= 1000;
		
		int ans = Math.min(cal1(A), cal2(A)) + Math.min(cal1(B), cal2(B));
		
		if (ans % 100 > 9) 
			System.out.println((ans / 100) + "." + (ans % 100));
		else
			System.out.println((ans / 100) + ".0" + (ans % 100));
		
	}

	private static int cal1(int x) {
		
		if (x <= 5) return 400;
		if (x <= 10) return 700;
		if (x <= 20) return 1200;
		if (x <= 30) return 1700;
		return x * 57;
		
	}

	private static int cal2(int x) {
		
		if (x <= 2) return 90 + x * 90;
		if (x <= 5) return 100 + x * 85;
		if (x <= 20) return 125 + x * 80;
		if (x <= 40) return 325 + x * 70;
		return 925 + 55 * x;
		
	}
}
