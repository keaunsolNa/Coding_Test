import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < S; i++) {
			st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			
			boolean keep = false;
			for(int j = 0; j < m; j++) {
				int choise = Integer.parseInt(st.nextToken());
				
				if(choise == P) keep = true;
			}
			
			if(keep) System.out.println("KEEP");
			else System.out.println("REMOVE");
		}
		
	}
}
