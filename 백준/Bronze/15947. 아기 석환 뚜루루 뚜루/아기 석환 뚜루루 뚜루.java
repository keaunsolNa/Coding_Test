import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[][] sing = new String[4][];
		sing[0] = new String[4];
		sing[1] = new String[4];
		sing[2] = new String[4];
		sing[3] = new String[2];
		
		sing[0][0] = "baby";
		sing[0][1] = "sukhwan";
		sing[0][2] = "tururu";
		sing[0][3] = "turu";
		
		sing[1][0] = "very";
		sing[1][1] = "cute";
		sing[1][2] = "tururu";
		sing[1][3] = "turu";
		
		sing[2][0] = "in";
		sing[2][1] = "bed";
		sing[2][2] = "tururu";
		sing[2][3] = "turu";

		sing[3][0] = "baby";
		sing[3][1] = "sukhwan";
		
		int outIdx = 0;
		while(N - (14 * outIdx) > 0) {
			outIdx++;
		}
		
		
		outIdx--;
		StringBuilder app = new StringBuilder();
		
		while(outIdx --> 0) app.append("ru");
		
		for(int i = 0; i < 3; i++) {
			
			sing[i][2] += app.toString();
			sing[i][3] += app.toString();
			
		}
		
		N = (N / 15) + (N % 15);
		
		while(true) {
			
			for(int i = 0; i < sing.length; i++) {
				
				for(int j = 0; j < sing[i].length; j++) {
					if(N == 1) {
						
						if(sing[i][j].contains("ru")) {
							int ruCount = (sing[i][j].length() - sing[i][j].replace("ru", "").length()) / 2;
							if(ruCount >= 5) {
								sing[i][j] = "tu+ru*" + ruCount;
								
							}
							System.out.println(sing[i][j]);
						} else {
							System.out.println(sing[i][j]);
						}
						return;
					}
					N--;
				}
			}
		}
	}
}
