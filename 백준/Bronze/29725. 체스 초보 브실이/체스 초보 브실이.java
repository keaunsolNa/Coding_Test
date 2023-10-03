import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int W = 0;
		int B = 0;
		for(int i = 0; i < 8; i++) {
			
			String line = br.readLine();
			for(int j = 0; j < 8; j++) {
				char target = line.charAt(j);
				
				W += target == 'P' ? 1 : target == 'N' ? 3 : target == 'B' ? 3 : target == 'R' ? 5 : target == 'Q' ? 9 : 0;
				B += target == 'p' ? 1 : target == 'n' ? 3 : target == 'b' ? 3 : target == 'r' ? 5 : target == 'q' ? 9 : 0;
			}
		}
		
		System.out.println(W - B);
        
	}
}
