import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
			int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
			
			int ab = Integer.parseInt(new StringBuilder(A+B+"").reverse().toString());
			
			System.out.println(ab);
		}
		
	}
}
