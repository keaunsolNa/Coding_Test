import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double sum = 0;
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			
			double number = A / B;
			
			sum += number;
			max = Math.max(number, max);
			min = Math.min(number, min);
		}
		
		System.out.printf("%.11f", min);
		System.out.print(" ");
		System.out.printf("%.11f", max);
		System.out.print(" ");
		System.out.printf("%.11f", sum);
	}
}
