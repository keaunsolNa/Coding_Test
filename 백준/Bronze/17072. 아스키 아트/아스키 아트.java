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

    private static int n, l, r;
	private static int N; 
	private static int M;

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				
				int r = Integer.parseInt(st.nextToken());
				int g = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int rgb = (2126 * r) + (7152 * g) + (722 * b);
				
	            if (0 <= rgb && rgb < 510000)
	            	sb.append(String.format("%c", 35));
	            else if (510000 <= rgb && rgb < 1020000)
	            	sb.append(String.format("%c", 111));
	            else if (1020000 <= rgb && rgb < 1530000)
	            	sb.append(String.format("%c", 43));
	            else if (1530000 <= rgb && rgb < 2040000)
	            	sb.append(String.format("%c", 45));
	            else
	            	sb.append(String.format("%c", 46));
	            
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
