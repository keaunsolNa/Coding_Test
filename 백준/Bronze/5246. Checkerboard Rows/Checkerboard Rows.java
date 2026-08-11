import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int board = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < board; i++) {
			
			st = new StringTokenizer(br.readLine());
            int cntPieces = Integer.parseInt(st.nextToken());
            int[] rows = new int[8];
            
            for (int j = 0; j < cntPieces; j++) {
            	
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                rows[y - 1]++;
                
            }

            int maxPieces = Arrays.stream(rows).max().getAsInt();
            
            System.out.println(maxPieces);
        }

	}
}
