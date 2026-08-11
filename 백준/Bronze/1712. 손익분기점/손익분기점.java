import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test01();
	}

	public static void test01() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		A = -A;
		int cnt = 0;
		if(B > C || (C-B) == 0) {
			System.out.println(-1);
		} else {
			System.out.println(((Math.abs(A))/(C-B) + 1));
		}
		
	}
}
