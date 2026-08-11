import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] b = new int[3];
		for(int i = 0; i < 3; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int cs = b[0] - a[2];
		int cz = b[1] / a[1];
		int cy = b[2] - a[0];
		
		System.out.println(cs + " " + cz + " " + cy);
		
	}
}
