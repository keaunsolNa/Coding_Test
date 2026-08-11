import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int D = 0;
		int P = 0;
		while(N --> 0) {
			
			char temp = br.readLine().charAt(0);
			
			if(temp == 'D') D++;
			else P++;
			
			if(Math.abs(D - P) >= 2) break;
			
		}
		
		System.out.println(D + ":" + P);
	}
}
