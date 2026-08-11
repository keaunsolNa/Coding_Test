import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int whiteOrBlack = 1;
		for(int i = 1; i < 9; i++) {
			String temp = br.readLine();
			for(int j = 1; j < temp.length() + 1; j++) {
				if(temp.charAt(j - 1) == 'F') {
					if(j%2 == whiteOrBlack) {
						answer++;
					}
				}
			}
			if(whiteOrBlack == 1) {
				whiteOrBlack = 0;
			} else {
				whiteOrBlack = 1;
			}
		}
		
		System.out.println(answer);
	}
}
