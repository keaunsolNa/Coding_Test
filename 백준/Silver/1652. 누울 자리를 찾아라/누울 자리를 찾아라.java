import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];

        for(int i = 0; i < n; i++) {
            String[] val = br.readLine().split("");
            for(int j = 0; j < n; j++) {
                arr[i][j] = val[j].charAt(0);
            }
        }
        
        int x = 0, y = 0;
        for(int i = 0; i < n; i++) {
        	
            for (int j = 0 ; j < n; j++) {
            	
                if(i + 1 < n) {
                	
                    if (arr[i][j] == '.' && arr[i+1][j] == '.' && (i + 2 >= n || arr[i+2][j] == 'X')) {
                        y += 1;
                    }
                    
                }
                
                if(j + 1 < n) {
                	
                    if (arr[i][j] == '.' && arr[i][j + 1] == '.' && (j + 2 >= n || arr[i][j + 2] == 'X')) {
                        x += 1;
                    }
                    
                }
            }
        }
        System.out.println(x + " " + y);
	}
}
