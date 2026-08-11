import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int x = 0;
			int y = 0;
			int dn = 0;
			
			char[] move = br.readLine().toCharArray();
			
			for(int j = 0; j < move.length; j++) {
				
				switch(move[j]) {
				
					case 'R' : x++; break;
					case 'U' : y++; break;
					case 'L' : x--; break;
					case 'D' : y--; break;
					default : dn++;
				}
			}
			
			System.out.println((x - dn) + " " + (y - dn) + " " + (x + dn) + " " + (y + dn));
		}
	}
}
