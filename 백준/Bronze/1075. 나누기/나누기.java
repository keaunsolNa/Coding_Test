import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder N = new StringBuilder(br.readLine());
		N = N.deleteCharAt(N.length() - 1);
		N = N.deleteCharAt(N.length() - 1);
		int F = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 99; i++) {
			if(i < 10) {
				if(Integer.parseInt(N + "0" + i) % F == 0) {
					System.out.println("0"+i);
					break;
				}
			} else {
				if(Integer.parseInt(N +""+ i) % F == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
