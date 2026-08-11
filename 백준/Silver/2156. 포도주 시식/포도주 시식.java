import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	private static int max;
	private static int n;
	private static Integer[] wine;
	private static Integer[] point2;

	public static void main(String[] args) throws IOException {
		test11();
	}

	public static void test11() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		wine = new Integer[n + 1];
		point2 = new Integer[n + 1];
		for(int i = 1; i < n + 1; i++) wine[i] = Integer.parseInt(br.readLine());
		
		point2[0] = 0;
		point2[1] = wine[1];
		
		if(n >= 2) point2[2] = wine[1] + wine[2];
		
		System.out.println(getPointer(n));
	}

	private static int getPointer(int n) {
		
		if(point2[n] == null) point2[n] = Math.max(Math.max(getPointer(n - 2), 
														  getPointer(n - 3) + wine[n - 1]) + wine[n], 
														  getPointer(n - 1));
		return point2[n];
	}
}
