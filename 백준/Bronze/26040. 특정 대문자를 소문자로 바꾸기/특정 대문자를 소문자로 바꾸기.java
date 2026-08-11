import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String[] B = br.readLine().split(" ");
		
		for(int i = 0; i < B.length; i++) {
			String temp =  (char)(B[i].charAt(0) + 32) + "";
			A = A.replaceAll(B[i], temp +"");
		}
		
		System.out.println(A);
	}
}
