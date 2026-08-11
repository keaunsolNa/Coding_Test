import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double A1 = Double.parseDouble(st.nextToken());
		double P1 = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		double R1 = Double.parseDouble(st.nextToken());
		double P2 = Double.parseDouble(st.nextToken());
		
		double AP = A1/P1;
		double RP = (Math.PI*R1*R1)/P2;
		
		if(AP < RP) {
			System.out.println("Whole pizza");
		} else {
			System.out.println("Slice of pizza");
		}
	}
}
