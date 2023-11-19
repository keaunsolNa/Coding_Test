import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
	
		if(N == 1) System.out.println(0);
		
		else if(x == 1 && y == 1 || x == 1 && y==N || x == N && y == 1 || x == N && y == N) System.out.println(2);
		
		else if(x == 1 || x == N || y == 1 || y == N) System.out.println(3);
		
		else System.out.println(4);
	}
}
