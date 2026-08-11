import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static int N; 

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int aggre = 0;
		int denial = 0;
		int abstention = 0;
		
		for(int i = 0; i < N; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			if(input == 1) aggre++;
			else if(input == -1) denial++;
			else abstention++;
			
		}
		
		if((double)abstention >= (double)N / 2) System.out.println("INVALID");
		else if(aggre > denial) System.out.println("APPROVED");
		else System.out.println("REJECTED");
		
	}
}
