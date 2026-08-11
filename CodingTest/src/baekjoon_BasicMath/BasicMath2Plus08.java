package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus08 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
//	ICPC 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int P1 = Integer.parseInt(st.nextToken());
		int S1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int S2 = Integer.parseInt(st.nextToken());
		int P2 = Integer.parseInt(st.nextToken());

		int P = P1+P2;
		int S = S1+S2;
		if(P == S) {
			if(P1 == S2) {
				System.out.println("Penalty");
			} else if(P1 > S2){
				System.out.println("Esteghlal");
			} else {
				System.out.println("Persepolis");
			}
		} else {
			if(P > S) {
				System.out.println("Persepolis");
			} else {
				System.out.println("Esteghlal");
			}
		}
		
	}
}

