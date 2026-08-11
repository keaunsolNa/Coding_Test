import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double h = Integer.parseInt(st.nextToken());
		double w = Integer.parseInt(st.nextToken());
		
		if (w > h) {
			double temp = h;
			h = w;
			w = temp;
		}

		if (h >= 3 * w)
			System.out.printf("%.4f", w);

		else if (10 * h >= 15 * w)
			System.out.printf("%.4f", h / 3);
		
		else
			System.out.printf("%.4f", w / 2);

	}
}
