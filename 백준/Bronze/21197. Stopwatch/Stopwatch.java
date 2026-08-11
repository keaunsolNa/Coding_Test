import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		if(T % 2 != 0) {
			System.out.println("still running");
			return;
		}
		
		int total = 0;
		while(T --> 0) {
			int start = Integer.parseInt(br.readLine());
			int stop = Integer.parseInt(br.readLine());
			T--;
			
			total += stop - start;
		}
		
		System.out.println(total);
	}
}
