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
		test08();
	}

	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int time = 0;
		int P = 0;
		int totalB = 0;
		while(time != 24) {
			if(P+A <= M) {
				P += A;
				totalB += B;
			} else {
				P -= C;
				if(P < 0) {
					P = 0;
				}
			}
			time++;
		}
		
		System.out.println(totalB);
	}
}
