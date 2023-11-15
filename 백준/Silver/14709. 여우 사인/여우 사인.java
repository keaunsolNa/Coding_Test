import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		boolean[][] finger = new boolean[6][6];
		
		for(int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());
			
			int finger1 = Integer.parseInt(st.nextToken());
			int finger2 = Integer.parseInt(st.nextToken());
			finger[finger1][finger2] = true;
		}
		
		if(
				(finger[1][3] || finger[3][1]) && 
				(finger[1][4] || finger[4][1]) && 
				(finger[3][4] || finger[4][3]) && 			    
				isPick(2, finger) && isPick(5, finger)	
			) {
			System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
		}
		else System.out.println("Woof-meow-tweet-squeek");
	}
	
	private static boolean isPick(int start, boolean[][] finger) {
		
		for(int i = 1; i <= 5; i++) if(finger[start][i]) return false;
		
		return true;
	}
}