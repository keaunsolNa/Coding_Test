import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int length, num;
	private static int min = Integer.MAX_VALUE;
	private static int[] arr, list;
	private static boolean[] visited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		num = Integer.parseInt(s);
		length = s.length();
		
		arr = new int[length];
		list = new int[length];
		visited = new boolean[length];
		
		for(int i = 0; i < length; i++) arr[i] = Integer.parseInt(s.split("")[i]);
		
		solve(0);
		System.out.println(min == Integer.MAX_VALUE ? 0 : min);
		
	}
	
	private static void solve(int depth) {
		
		if(depth == length) {
			
			StringBuilder sb = new StringBuilder();
			for(int i: list) sb.append(i);
			
			int n = Integer.parseInt(sb.toString());
			
			if(num < n) min = Math.min(min, n);
			
			return;
		}
		
		for(int i = 0; i < length; i++) {
			
			if(!visited[i]) {
				
				visited[i] = true;
				list[depth] = arr[i];
				solve(depth + 1);
				visited[i] = false;
			}
		}
		
	}
}