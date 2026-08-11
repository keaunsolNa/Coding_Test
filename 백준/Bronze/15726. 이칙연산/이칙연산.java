import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		
		if(((A * B) / C) > ((A / B) * C)) {
			System.out.println((int) ((A * B) / C));
		} else {
			System.out.println((int) ((A / B) * C));
		}
	}
}
