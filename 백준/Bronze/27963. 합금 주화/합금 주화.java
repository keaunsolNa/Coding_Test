import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int d1 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int D1 = Math.max(d1, d2);
		int D2 = Math.min(d1, d2);
		double m = 100 - x;
		double v = m / D2;
		m = x;
		v += m / D1;
		System.out.println(100/v);
	}
}
