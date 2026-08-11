import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine())*100;
			int Q = 0;
			int D = 0;
			int N = 0;
			int P = 0;
			if(C/2500 > 0) {
				Q += C/2500;
				C %= 2500;
			}
			
			if(C/1000 > 0) {
				D += C/1000;
				C %= 1000;
			}

			if(C/500 > 0) {
				N += C/500;
				C %= 500;
			}
			
			if(C/100 > 0) {
				P += C/100;
				C %= 100;
			}
			System.out.println(Q + " " + D + " " + N + " " + P);
		}
	}
}
