import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		int length = input.length;
		int r = 1; 
		int c = 1;
		
        for (int i = 1; i < length; i++) {
            if (length % i == 0 && i <= length / i) {
                r = i;
                c = length / i;
            }
        }
        
        if (r == 0 && c == 0) {
            r = 1;
            c = 1;
        }
		
		int idx = 0;
		char answer[][] = new char[r][c];
		for(int i = 0; i < c; i++) {
			
			for(int j = 0; j < r; j++) {
				answer[j][i] = input[idx++];
			}
		}
		
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(answer[i][j]);
            }
        }
	}
}
