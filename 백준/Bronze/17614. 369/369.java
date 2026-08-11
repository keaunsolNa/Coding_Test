import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int N;

	public static void main(String[] args) {
		test10();
	}

	public static void test10() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < (i+"").length(); j++) {
				switch((i+"").charAt(j)) {
					case '3' : answer++; break;
					case '6' : answer++; break;
					case '9' : answer++; break;
				}
			}
		}
		
		System.out.println(answer);
	}
}
