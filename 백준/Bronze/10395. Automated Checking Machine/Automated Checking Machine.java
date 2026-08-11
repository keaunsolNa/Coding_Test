import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[5];
		for(int i = 0; i < 5; i++) arr1[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[5];
		for(int i = 0; i < 5; i++) arr2[i] = Integer.parseInt(st.nextToken());

		String answer = "Y";
		for(int i = 0; i < 5; i++) {
			if(arr1[i] == arr2[i]) {
				answer = "N";
				break;
			}
		}
		
		System.out.println(answer);
		
	}
}
