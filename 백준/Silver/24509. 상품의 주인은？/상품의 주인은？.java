import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

    private static int n;
	private static int [][] students;
	private static boolean [] chk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		students = new int [n + 1][4];
		chk = new boolean[n + 1];
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			int no = Integer.parseInt(st.nextToken());
			for(int j = 0; j < 4; j++)
				students[no][j] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i = 0; i < 4; i++) find(i);
	}
	
	public static void find(int idx) {
		
		int max = -1;
		int ans = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(!chk[i] && students[i][idx] > max) {
				ans = i;
				max = students[i][idx];
			}
		}
		
		chk[ans] = true;
		System.out.print(ans+" ");
	}
}
