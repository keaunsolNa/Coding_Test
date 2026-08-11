import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int D = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		double res = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(V, 2)));
		System.out.print((int)Math.floor(res * H) + " ");
		System.out.println((int)Math.floor(res * V));
		
	}
}
