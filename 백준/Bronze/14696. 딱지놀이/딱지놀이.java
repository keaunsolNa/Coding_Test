import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int[] A;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int aa = 0;
			int ab = 0;
			int ac = 0;
			int ad = 0;
			
			for(int i = 0; i < a; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				
				if(temp == 4) aa++;
				else if(temp == 3) ab++;
				else if(temp == 2) ac++;
				else ad++;
				
			}
			
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int ba = 0;
			int bb = 0;
			int bc = 0;
			int bd = 0;
			
			for(int i = 0; i < b; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				
				if(temp == 4) ba++;
				else if(temp == 3) bb++;
				else if(temp == 2) bc++;
				else bd++;
				
			}
			
			String answer = aa > ba ? "A" : aa < ba ? "B"
						   : ab > bb ? "A" : ab < bb ? "B"
						   : ac > bc ? "A" : ac < bc ? "B"
						   : ad > bd ? "A" : ad < bd ? "B" : "D";
		
			System.out.println(answer);
		}
	}
}
