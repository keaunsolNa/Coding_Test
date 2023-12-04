import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] screen = new char[10][20];
		for(int i = 0; i < 10; i++) 
			for(int j = 0; j < 20; j++)
				screen[i][j] = '.';

		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			int x = input.charAt(0) - 'A';
			int y = Integer.parseInt(input.substring(1, input.length())) - 1;
			
			screen[x][y] = 'o';
			
		}
		
		for (char[] cs : screen) {
			for (char cs2 : cs) {
				System.out.print(cs2);
			}
			System.out.println();
		}
   }
}