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
		test05();
	}

	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		int maxA = 0;
		int minA = 0;
		int maxB = 0;
		int minB = 0;
		if(A.contains("5") || A.contains("6")) {
			maxA = Integer.parseInt(A.replaceAll("5", "6"));
			minA = Integer.parseInt(A.replaceAll("6", "5"));
		} else {
			maxA = Integer.parseInt(A);
			minA = Integer.parseInt(A);
		}
		
		if(B.contains("5") || B.contains("6")) {
			maxB = Integer.parseInt(B.replaceAll("5", "6"));
			minB = Integer.parseInt(B.replaceAll("6", "5"));
		} else {
			maxB = Integer.parseInt(B);
			minB = Integer.parseInt(B);
		}
		
		System.out.println((minA+minB) + " " + (maxA+maxB));
	}
}
